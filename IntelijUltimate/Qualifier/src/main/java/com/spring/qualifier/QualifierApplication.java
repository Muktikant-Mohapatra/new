package com.spring.qualifier;

import com.spring.qualifier.controller.ConstructorInjectionController;
import com.spring.qualifier.controller.PropertyInjectionController;
import com.spring.qualifier.controller.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class QualifierApplication {

    public static void main(String[] args) {

        ApplicationContext ctx=SpringApplication.run(QualifierApplication.class, args);
        System.out.println(ctx);
        System.out.println(ctx.getBean(PropertyInjectionController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectionController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectionController.class).sayHello());
    }

}
