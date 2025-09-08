package com.vc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BootMsProj05BillingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj05BillingServiceApplication.class, args);
	}

}
