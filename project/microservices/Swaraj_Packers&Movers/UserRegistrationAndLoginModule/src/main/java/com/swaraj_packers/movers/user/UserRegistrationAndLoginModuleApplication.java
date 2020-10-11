package com.swaraj_packers.movers.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans(@ComponentScan(basePackages = { "com.swaraj_packers.movers.user.registrationAndLogin.security",
		                        "com.swaraj_packers.movers.user.registration.dao",
		                        "com.swaraj_packers.movers.user.controller",
		                        "com.swaraj_packers.movers.user.registration.repository",
		                        "com.swaraj_packers.movers.user.registration.service",
		                        "com.swaraj_packers.movers.user.registration.repository"
		                      }))
public class UserRegistrationAndLoginModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationAndLoginModuleApplication.class, args);
	}

}
