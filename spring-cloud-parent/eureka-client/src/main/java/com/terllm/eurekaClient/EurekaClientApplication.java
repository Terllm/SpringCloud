package com.terllm.eurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//@EnableEurekaClient
@EnableEurekaServer
public class EurekaClientApplication {

	
	public static void main(String[] args) { 
		
		SpringApplication.run(EurekaClientApplication.class, args);
	}
	 
	
	
	
}
