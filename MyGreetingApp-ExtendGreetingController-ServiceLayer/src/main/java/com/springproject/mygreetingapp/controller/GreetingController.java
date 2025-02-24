package com.springproject.mygreetingapp.controller;

import com.springproject.mygreetingapp.service.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    // Constructor-based dependency injection
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // GET request to return a greeting message from the Service Layer
    @GetMapping
    public String getGreeting() {
        return greetingService.getGreetingMessage();
    }

    // POST request to return a custom greeting message
    @PostMapping
    public String postGreeting() {
        return "Greeting created successfully!";
    }
}