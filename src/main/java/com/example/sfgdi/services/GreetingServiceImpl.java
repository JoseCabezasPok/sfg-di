package com.example.sfgdi.services;

import org.springframework.stereotype.Service;


public class GreetingServiceImpl implements GreetingService {
    @Override
    public String SayGreeting() {
        return "Hello World";
    }
}
