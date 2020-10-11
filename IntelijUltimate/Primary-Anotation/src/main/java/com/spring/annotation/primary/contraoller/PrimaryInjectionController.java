package com.spring.annotation.primary.contraoller;

import com.spring.annotation.primary.service.GreetingService;
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
