package com.example.microservicesconfigtechniques.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class GreetingController {
    @Value("${app.message: default value}")
    private String greetingMessage;

    @Value(" This is static message ")
    private String staticMessage;
    @Value("${app.list}")
    private List<String> stringList;
    @Value("#{${app.keyvalue}}")
    private Map<String, String> map;

    @GetMapping(path = "/greeting")
    public String getGretting() {
        return greetingMessage + staticMessage + stringList+ map;
    }
}
