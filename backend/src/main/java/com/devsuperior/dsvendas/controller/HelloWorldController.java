package com.devsuperior.dsvendas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController //para configurar a classe como controller
public class HelloWorldController {
    
    @GetMapping(value = "/")
    public String getMethodName() {
        return "Hello World!";
    }
}