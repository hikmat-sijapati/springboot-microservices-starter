package com.developer.hikmat.apiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EntityScan( basePackages = {"com.developer.hikmat"})
@ComponentScan( basePackages = {"com.developer.hikmat"})
@EnableDiscoveryClient
public class ApiserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiserviceApplication.class, args);
	}

}
