package com.grocerystore.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GroceryStoreFrontEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroceryStoreFrontEndApplication.class, args);
	}

}
