package com.springproject.mygreetingapp.service;

import com.springproject.mygreetingapp.model.Greeting;
import com.springproject.mygreetingapp.repository.GreetingRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    // Save a new greeting
    public Greeting saveGreeting(String message) {
        return greetingRepository.save(new Greeting(message));
    }

    // Find a greeting by ID
    public Greeting findGreetingById(Long id) {
        return greetingRepository.findById(id).orElse(null);
    }
}