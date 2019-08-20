package com.terllm.eurekaClient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DomainController {

	@RequestMapping("hello")
	public String test() {
		
		return "Hello World !!!";
		
	}

	
	
	
	
}
