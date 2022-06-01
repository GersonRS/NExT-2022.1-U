package com.example.aula17.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerWelcome {

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
}
