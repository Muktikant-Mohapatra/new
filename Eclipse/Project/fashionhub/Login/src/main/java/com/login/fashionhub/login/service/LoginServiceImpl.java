package com.login.fashionhub.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.fashionhub.login.bo.LoginCredentialsBo;
import com.login.fashionhub.login.dto.UserCredentialDto;
import com.login.fashionhub.login.repository.UserLoginRepo;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private UserLoginRepo loginRepository;

	@Override
	public String UserLogin(UserCredentialDto userDto) {
		LoginCredentialsBo loginUser = new LoginCredentialsBo();
		loginUser.setEmail(userDto.getEmail());
		loginUser.setPassword(userDto.getPassword());
		 LoginCredentialsBo findByEmail = loginRepository.findByEmail(loginUser.getEmail());
		if (findByEmail!=null) {
			return "Success";
		}
		return "failure";
	}

}
