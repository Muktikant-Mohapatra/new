package com.login.fashionhub.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.login.fashionhub.login.dto.UserCredentialDto;
import com.login.fashionhub.login.service.LoginService;

@Controller
public class UserLoginController {
	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showUserLoginPage() {
		return "login&Registration";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String verifyUser(@ModelAttribute UserCredentialDto userDto) {
		String status = loginService.UserLogin(userDto);
		if (status.equals("Success")) {
			return "NewFile";	
		}else {
			return "login&Registration";
		}
		
	}
}
