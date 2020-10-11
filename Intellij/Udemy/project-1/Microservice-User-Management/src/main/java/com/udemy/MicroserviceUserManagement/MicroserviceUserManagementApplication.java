package com.udemy.MicroserviceUserManagement;

import com.udemy.MicroserviceUserManagement.config.WebSecurityConfig;
import com.udemy.MicroserviceUserManagement.controller.UserController;
import com.udemy.MicroserviceUserManagement.service.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.security.core.userdetails.UserDetailsService;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScans(@ComponentScan(basePackageClasses = {WebSecurityConfig.class, UserServiceImpl.class,UserController.class, UserDetailsService.class}))
@ComponentScan(basePackages = {"com.udemy.Microservic̥eUserManagement.repository","com.udemy.Microservic̥eUserManagement.service"})
@EnableDiscoveryClient
@EnableEurekaClient
public class MicroserviceUserManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceUserManagementApplication.class, args);
    }

}
