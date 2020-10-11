package com.demo.controller;

import com.demo.service.GreetingService;
import com.demo.service.GreetingServiceImpl;

public class PropertyInjectionController {
    public GreetingServiceImpl greetingServiceImpl;
    public String sayHello(){
        return getGreetingServiceImpl().greeting();
    }
    public GreetingService getGreetingServiceImpl() {
        return greetingServiceImpl;
    }
}
