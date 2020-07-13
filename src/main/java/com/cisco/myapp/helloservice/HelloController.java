package com.cisco.myapp.helloservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping(value = "/hello", produces = "application/json")
    public String sayHello() {
    	return "Hello";
    }
}
