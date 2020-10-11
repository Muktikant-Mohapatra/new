package com.demo.controller;

import com.demo.service.GreetingService;

public class ConstructorInjectionController {
    private GreetingService greetingService;

    public ConstructorInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.greeting();
    }
}
