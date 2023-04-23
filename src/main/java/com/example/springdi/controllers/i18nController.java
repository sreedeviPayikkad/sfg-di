package com.example.springdi.controllers;

import com.example.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class i18nController {
    @Qualifier("i18nService")
    @Autowired
    GreetingService greetingService;
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
