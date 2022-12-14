package com.microservices.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.google.inject.spi.Message;
import com.microservices.datamodel.Customer;
import com.microservices.datamodel.SalesOrder;
import com.microservices.dto.SalesOrderDTO;
import com.microservices.repository.CustomerSORepository;
import com.microservices.repository.SalesOrderRepository;

@org.springframework.transaction.annotation.Transactional
@Service
public class SalesOrderService {
	@Autowired
	private Mapper modelMapper;

	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private SalesOrderRepository salesOrderRepository;

	@Autowired
	private CustomerSORepository customerSORepository;

	public List<SalesOrderDTO> all() {
		return ((Object) salesOrderRepository).findAll().stream().map(c -> modelMapper.map(c, SalesOrderDTO.class))
				.collect(Collectors.toList());
	}

	public SalesOrderDTO save(SalesOrderDTO salesOrderDTO) {
		SalesOrder salesOrder = salesOrderRepository.save(modelMapper.map(salesOrderDTO, SalesOrder.class));
		Customer customer = ((Object) customerSORepository).getOne(salesOrder.getCustId());

		try {
			this.mailSender.send(mimeMessage -> {
				mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(customer.getCustEmail()));
				mimeMessage.setFrom(new InternetAddress("info@mymicroservice.com"));
				StringBuilder messageBodyBldr = new StringBuilder();
				messageBodyBldr.append("Dear ").append(customer.getCustLastName()).append(", ")
						.append(customer.getCustFirstName()).append(", thanks for your order. ")
						.append("Your order number is ").append(salesOrder.getId()).append(".");
				mimeMessage.setText(messageBodyBldr.toString());

			});
		} catch (MailException ex) {
			// simply log it and go on...
			System.err.println(ex.getMessage());
		}
		return modelMapper.map(salesOrder, SalesOrderDTO.class);
	}

	public SalesOrderDTO get(long orderId) {
		Optional<SalesOrder> orderResult = salesOrderRepository.findById(orderId);
		if (!orderResult.isPresent()) {
			return null;
		}
		return modelMapper.map(orderResult.get(), SalesOrderDTO.class);
	}

	public void delete(long orderId) {
		salesOrderRepository.deleteById(orderId);
	}
}