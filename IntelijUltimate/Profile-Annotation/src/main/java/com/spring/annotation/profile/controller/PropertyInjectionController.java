package com.spring.annotation.profile.controller;




import com.spring.annotation.profile.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {
    @Autowired
   // @Qualifier("property-service")
    public GreetingService greetingServiceImpl;

    public String sayHello() {
         return greetingServiceImpl.greeting();
    }


}
