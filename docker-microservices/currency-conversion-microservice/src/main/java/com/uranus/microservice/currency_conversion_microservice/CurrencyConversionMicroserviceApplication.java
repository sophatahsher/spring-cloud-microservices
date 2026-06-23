package com.uranus.microservice.currency_conversion_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients // spring-cloud-starter-openfeign is a Spring Boot starter dependency that provides a declarative REST client. It allows developers to make HTTP calls to other services by simply writing a Java interface and annotating it, completely eliminating the boilerplate code typically required for RestTemplate or WebClient.
@EnableDiscoveryClient // This is the annotation that enables Eureka client functionality
public class CurrencyConversionMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionMicroserviceApplication.class, args);
	}

}
