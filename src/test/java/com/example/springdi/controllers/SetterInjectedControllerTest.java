package com.example.springdi.controllers;

import com.example.springdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller =  new SetterInjectedController();
    }

    @Test
    void getGreeting() {
        controller.setGreetingService(new ConstructorGreetingServiceImpl());
        System.out.println(controller.getGreeting());
    }
}