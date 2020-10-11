package com.swarajpackersmovers.login;

import com.swarajpackersmovers.login.security.AuthenticationFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScans(@ComponentScan(basePackages = {"com.swarajpackersmovers.login.entity",
        "com.swarajpackersmovers.login.response",
        "com.swarajpackersmovers.login.repository",
        "com.swarajpackersmovers.login.dao",
        "com.swarajpackersmovers.login.dto",
        "com.swarajpackersmovers.login.request",
        "com.swarajpackersmovers.login.controller",
        "com.swarajpackersmovers.login.service",
        "com.swarajpackersmovers.login.enums",
        "com.swarajpackersmovers.login.security",
        "com.swarajpackersmovers.login.utility"}))
public class LoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class, args);
    }

}
