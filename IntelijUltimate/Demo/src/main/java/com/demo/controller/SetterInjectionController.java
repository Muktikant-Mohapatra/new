package com.demo.controller;

import com.demo.service.GreetingService;

public class SetterInjectionController {
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.greeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
