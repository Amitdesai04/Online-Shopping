package com.microservices.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpEntity;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebMvc
@Order(1)
public class SecurityConfiguration extends WebMvcConfigurerAdapter implements WebMvcConfigurer {

	@Value("${ui.serverUrl}")
	private String uiServer;

	protected void configure(@SuppressWarnings("rawtypes") HttpEntity http) throws Exception {
		((obj) http).csrf().disable().headers().frameOptions().sameOrigin().httpStrictTransportSecurity().disable();
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowedHeaders("*").allowedMethods("*");
	}
}