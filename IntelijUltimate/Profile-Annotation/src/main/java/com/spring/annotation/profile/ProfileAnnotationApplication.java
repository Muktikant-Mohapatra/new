package com.spring.annotation.profile;

import com.spring.annotation.profile.controller.ConstructorInjectionController;
import com.spring.annotation.profile.controller.PrimaryInjectionController;
import com.spring.annotation.profile.controller.PropertyInjectionController;
import com.spring.annotation.profile.controller.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProfileAnnotationApplication {

    public static void main(String[] args) {
        ApplicationContext ctx=SpringApplication.run(ProfileAnnotationApplication.class, args);
        System.out.println(ctx.getBean(PrimaryInjectionController.class).sayHello());
        System.out.println(ctx.getBean(PropertyInjectionController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectionController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectionController.class).sayHello());
    }

}
