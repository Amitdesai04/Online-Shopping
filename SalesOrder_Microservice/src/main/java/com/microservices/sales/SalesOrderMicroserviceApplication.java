package com.microservices.sales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.kafka.annotation.EnableKafka;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableEurekaClient
@EnableSwagger2
@EnableJdbcRepositories
@SpringBootApplication
@EnableKafka
public class SalesOrderMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesOrderMicroserviceApplication.class, args);
	}
}


