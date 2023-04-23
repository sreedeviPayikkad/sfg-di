package com.example.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"EN", "default"})
@Service("i18nService")

public class i18nEnglishServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
