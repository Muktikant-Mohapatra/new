package com.swarajpackersmovers.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.logging.Logger;

@SpringBootApplication(exclude = UserDetailsServiceAutoConfiguration.class)
@ComponentScans(@ComponentScan(basePackages = {
        "com.swarajpackersmovers.user.registration.dao",
        "com.swarajpackersmovers.user.controller",
        "com.swarajpackersmovers.user.registration.repository",
        "com.swarajpackersmovers.user.registration.service",
        "com.swarajpackersmovers.user.registration.request",
        "com.swarajpackersmovers.user.registration.response",
        "com.swarajpackersmovers.user.registration.entity",
        "com.swarajpackersmovers.user.registration.service",
        "com.swarajpackersmovers.user.utility",
        "com.swarajpackersmovers.user.security",
      }))
@EnableJpaRepositories
public class UserRegistrationAndLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserRegistrationAndLoginApplication.class, args);
    }
}
