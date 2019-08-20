package com.terllm.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipKinApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(ZipKinApplication.class, args);

	}

}
