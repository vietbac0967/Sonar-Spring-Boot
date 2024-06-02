package com.example.sonarqubespring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping
public class HelloController {
    @GetMapping
    private String hello(){
        return "Hello world " + LocalDate.now();
    }
    @GetMapping("/bye")
    public String sayGoodBye(){
        return  "Goody bye";
    }
}
