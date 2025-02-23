package com.springproject.mygreetingapp.service;

import com.springproject.mygreetingapp.model.Greeting;
import com.springproject.mygreetingapp.repository.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public Greeting saveGreeting(String message) {
        return greetingRepository.save(new Greeting(message));
    }
}