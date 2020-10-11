package com.spring.annotation.profile.controller;


import com.spring.annotation.profile.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryInjectionController {
    private GreetingService greetingService;

    public PrimaryInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return  greetingService.greeting();
    }
}
