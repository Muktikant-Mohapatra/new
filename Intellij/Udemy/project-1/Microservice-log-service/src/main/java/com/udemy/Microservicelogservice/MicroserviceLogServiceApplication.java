package com.udemy.Microservicelogservice;

import com.udemy.Microservicelogservice.controller.LogController;
import com.udemy.Microservicelogservice.service.LogServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScans(@ComponentScan(basePackageClasses = { LogServiceImpl.class, LogController.class}))
@ComponentScan(basePackages = {"com.udemy.Microservic̥eUserManagement.repository"})
public class MicroserviceLogServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceLogServiceApplication.class, args);
    }

}
