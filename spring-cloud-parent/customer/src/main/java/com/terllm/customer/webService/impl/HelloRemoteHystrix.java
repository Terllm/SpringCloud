package com.terllm.customer.webService.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.terllm.customer.webService.HelloRemote;

@Component
public class HelloRemoteHystrix implements HelloRemote {

	@Override
	public String hello(@RequestParam(value = "name") String name) {
		// TODO Auto-generated method stub
		return "hello" +name+", this messge send failed ";
	}

}
