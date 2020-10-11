package com.demo.controller;

import com.demo.service.GreetingServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class PropertyInjectionControllerTest {
    private PropertyInjectionController propertyInjectionController;
    @BeforeEach
    public void  setup ()throws Exception{
        this.propertyInjectionController =new PropertyInjectionController();
        this.propertyInjectionController.greetingServiceImpl=new GreetingServiceImpl();
    }
    @Test
    public void testGreeting()throws Exception{
        Assertions.assertEquals(GreetingServiceImpl.HELLO_GREET,propertyInjectionController.sayHello());
    }
}
