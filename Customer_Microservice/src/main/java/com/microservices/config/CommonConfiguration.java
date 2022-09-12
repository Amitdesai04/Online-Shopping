package com.microservices.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.ModelMap;

@Configuration
public class CommonConfiguration {
	@Bean
	public ModelMap modelMapper() {
		return new ModelMap();
	}
}