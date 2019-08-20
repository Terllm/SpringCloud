package com.terllm.configClientRefresh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RefreshScope
public class HelloController {

	
	@Value("${neo}")
	private String neo;
	
	@RequestMapping("hello")
	public String hello() {
		
		return neo;
		
	}
	
	
	
	
}
