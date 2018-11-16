package com.example.helloservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HelloController {
    private static final String template = "Hello, %s!";
    @Value("${name:Hello default}")
    private String name;

    @RequestMapping("/hello")
    String getDefaultMessage() {
        return String.format(template, name);
    }

    @RequestMapping("/hello/{name}")
    String getMessage(@PathVariable String name) {
        return String.format(template, name);
    }
}