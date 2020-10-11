package com.login.fashionhub.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.login.fashionhub.registration.dto.UserDetailsDTO;
import com.login.fashionhub.registration.service.UserRegistrationService;

@Controller
public class UserRegistrationController {
	@Autowired
	private UserRegistrationService regService;
	
	@RequestMapping(name = "/register", method = RequestMethod.GET)
	public String showUserRegistrationPage() {
		return "login&Registration";
	}
	@RequestMapping(value = "/register" , method = RequestMethod.POST)
	public String registerUser(@ModelAttribute UserDetailsDTO user) {
		regService.registerMember(user);
		return "NewFile";
	}
}
