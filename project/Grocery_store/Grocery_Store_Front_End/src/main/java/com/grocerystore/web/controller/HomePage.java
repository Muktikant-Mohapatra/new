package com.grocerystore.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePage {
	@GetMapping("/index")
	public String homePage() {
		return "index";
	}
}
