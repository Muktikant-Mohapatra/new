package com.spring.qualifier.controller;


import com.spring.qualifier.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.greeting();
    }
    @Autowired
    @Qualifier("setter-service")
    public void setGreetingService( GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
