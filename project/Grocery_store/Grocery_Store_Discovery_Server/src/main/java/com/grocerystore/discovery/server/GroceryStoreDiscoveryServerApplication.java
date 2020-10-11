package com.grocerystore.discovery.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GroceryStoreDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroceryStoreDiscoveryServerApplication.class, args);
	}

}
