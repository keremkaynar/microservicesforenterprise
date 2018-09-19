package com.ex.administration.hr.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HumanResourcesApplication {
	public static void main(String[] args) {
		SpringApplication.run(HumanResourcesApplication.class, args);
	}
}
