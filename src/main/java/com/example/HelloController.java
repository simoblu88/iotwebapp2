package com.example;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@EnableAutoConfiguration
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot   ssssss !";
    }
    
}
