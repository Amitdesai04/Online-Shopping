package com.microservices.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.TypeMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.microservices.datamodel.Customer;
import com.microservices.datamodel.OrderLineItem;
import com.microservices.dto.OrderLineItemDTO;
import com.microservices.messagelistener.CustomerMessageListener;

@Configuration
public class CommonConfiguration {
		
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.createTypeMap(OrderLineItem.class, OrderLineItemDTO.class);
		modelMapper.createTypeMap(OrderLineItemDTO.class, OrderLineItem.class);
		TypeMap<com.vipul.messagelistener.CustomerMessageListener.Customer, Customer> typeMap = modelMapper
				.createTypeMap(com.vipul.messagelistener.CustomerMessageListener.Customer.class, Customer.class);
		typeMap.addMappings(new PropertyMap<CustomerMessageListener.Customer, Customer>() {

			@Override
			protected void configure() {
				map().setCustEmail(source.getEmail());
				map().setCustId(source.getId());
				map().setCustFirstName(source.getFirstName());
				map().setCustLastName(source.getLastName());
			}
		});
		return modelMapper;
	}
	
}