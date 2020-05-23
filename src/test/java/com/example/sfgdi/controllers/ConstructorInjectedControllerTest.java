package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingCastellano;
import com.example.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;


    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingCastellano());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}