package com.terllm.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.terllm.customer.webService.HelloRemote;

@Controller
public class ConsumerController {

    @Autowired
    private HelloRemote helloRemote;
	
    @RequestMapping("/hello/{name}") 
    @ResponseBody
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello1(name);
    }
    
    @RequestMapping("index")
    public String hello() {
    	
    	return "index";
    }
    
    @RequestMapping("/hell/{name}") 
    @ResponseBody
    public String index1(@PathVariable("name") String name) {
        return helloRemote.hello1(name);
    }
}