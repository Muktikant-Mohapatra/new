package com.grocerystore.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginControllerAndRegistrationController {
	@GetMapping(value = "/login")
	public String showLoginPage() {
		return "login";
	}

	@GetMapping(value = "/registration")
	public String showRegistrationPage() {
		return "login";
	}
}
