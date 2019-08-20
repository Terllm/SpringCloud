package com.terllm.zuul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.terllm.zuul.filter.TokenFilter;

@Component
public class Configurations {

	@Bean
	public TokenFilter tokenFilter() {
		return new TokenFilter();
		
	}
	
	
	
}
