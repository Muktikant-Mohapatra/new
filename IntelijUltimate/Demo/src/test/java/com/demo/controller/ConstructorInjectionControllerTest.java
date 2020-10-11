package com.demo.controller;

import com.demo.service.GreetingService;
import com.demo.service.GreetingServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConstructorInjectionControllerTest {
    private ConstructorInjectionController constructorInjectionController;
    @BeforeEach
    public void setup(){
        this.constructorInjectionController=new ConstructorInjectionController(new GreetingServiceImpl());
    }
    @Test
    public void testGreetings(){
        Assertions.assertEquals(GreetingServiceImpl.HELLO_GREET,constructorInjectionController.sayHello());
    }
}
