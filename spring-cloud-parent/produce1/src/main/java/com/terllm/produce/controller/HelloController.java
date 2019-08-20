package com.terllm.produce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	
    @RequestMapping("/hello")
    @ResponseBody
    public String index1() {
        return "index2";
    } 
    
    @RequestMapping("index")
    public String index() {
    	
    	return "index2";
    	
    }
    
    
}
