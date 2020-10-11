package com.spring.ioc;

import com.spring.ioc.controller.ConstructorInjectionController;
import com.spring.ioc.controller.PropertyInjectionController;
import com.spring.ioc.controller.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IocInversionOfControlApplication {
    private static ApplicationContext ctx;

    public static void main(String[] args) {
        ctx = SpringApplication.run(IocInversionOfControlApplication.class, args);

        System.out.println(ctx.getBean(PropertyInjectionController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectionController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectionController.class).sayHello());
    }

}
