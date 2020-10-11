package com.spring.annotation.primary;

import com.spring.annotation.primary.contraoller.ConstructorInjectionController;
import com.spring.annotation.primary.contraoller.PrimaryInjectionController;
import com.spring.annotation.primary.contraoller.PropertyInjectionController;
import com.spring.annotation.primary.contraoller.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PrimaryAnotationApplication {

    public static void main(String[] args) {
        ApplicationContext ctx=SpringApplication.run(PrimaryAnotationApplication.class, args);
        System.out.println(ctx.getBean(PrimaryInjectionController.class).sayHello());
        System.out.println(ctx.getBean(PropertyInjectionController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectionController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectionController.class).sayHello());
    }

}
