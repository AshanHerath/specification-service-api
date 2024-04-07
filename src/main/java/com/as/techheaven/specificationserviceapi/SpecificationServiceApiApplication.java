package com.as.techheaven.specificationserviceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpecificationServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpecificationServiceApiApplication.class, args);
	}

}
