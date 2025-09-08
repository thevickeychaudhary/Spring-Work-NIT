package com.vc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BootMsProj01RAndServerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj01RAndServerEurekaApplication.class, args);
	}

}
