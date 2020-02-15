package com.example.microservicesconfigtechniques.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Value("${app.message}")
    private String greetingMessage;

    @GetMapping(path = "/greeting")
    public String getGretting() {
        return greetingMessage;
    }
}
