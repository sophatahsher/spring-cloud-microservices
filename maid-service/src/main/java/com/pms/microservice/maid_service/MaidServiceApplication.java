package com.pms.microservice.maid_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MaidServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaidServiceApplication.class, args);
	}

}
