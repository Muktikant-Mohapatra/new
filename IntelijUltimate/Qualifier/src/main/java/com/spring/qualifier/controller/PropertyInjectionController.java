package com.spring.qualifier.controller;


import com.spring.qualifier.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {
    @Autowired
    @Qualifier("property-service")
    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.greeting();
    }


}
