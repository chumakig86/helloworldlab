package com.example.helloworldservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello-world")
    String getDefaultMessage() {
        return "Hello World!!!";
    }
}
