package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingCastellano implements GreetingService {
    @Override
    public String SayGreeting() {
        return "Hola Mundo";
    }
}
