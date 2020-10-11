package com.spring.annotation.profile.controller;




import com.spring.annotation.profile.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {
    private GreetingService greetingService;

    public ConstructorInjectionController(@Qualifier("constructor-service") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
        return greetingService.greeting();
    }
}
