package com.microservices.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.datamodel.Customer;
import com.microservices.dto.CustomerDTO;
import com.microservices.messagelistener.CustomerMessageListener;
import com.microservices.repository.CustomerSORepository;

@Service
public class CustomerService {
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private CustomerSORepository customerSORepository;

	public CustomerDTO save(CustomerMessageListener.Customer customer) {
		Customer customer2 = customerSORepository.save(modelMapper.map(customer, Customer.class));
		return modelMapper.map(customer2, CustomerDTO.class);
	}

}