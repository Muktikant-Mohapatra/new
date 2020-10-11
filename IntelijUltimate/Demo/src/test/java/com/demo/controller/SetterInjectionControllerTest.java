package com.demo.controller;

import com.demo.service.GreetingServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetterInjectionControllerTest {
    private SetterInjectionController setterInjectionController;
    @BeforeEach
    public void setup(){
        this.setterInjectionController=new SetterInjectionController();
        this.setterInjectionController.setGreetingService(new GreetingServiceImpl());
    }
    @Test
    public void testGreeting(){
        Assertions.assertEquals(GreetingServiceImpl.HELLO_GREET,setterInjectionController.sayHello());
    }
}
