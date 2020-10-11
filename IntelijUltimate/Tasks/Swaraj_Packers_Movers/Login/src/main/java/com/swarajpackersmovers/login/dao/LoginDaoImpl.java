package com.swarajpackersmovers.login.dao;

import com.swarajpackersmovers.login.dto.LoginDto;
import com.swarajpackersmovers.login.entity.LoginEntity;
import com.swarajpackersmovers.login.repository.LoginRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginDaoImpl implements LoginDao {
    private LoginRepository loginRepository;
    private ModelMapper modelMapper;
    @Autowired
    public LoginDaoImpl(LoginRepository loginRepository, ModelMapper modelMapper) {
        this.loginRepository = loginRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public LoginDto searchUser(String username) {
        LoginEntity nonVerifiedUser = loginRepository.findByEmail(username);

        LoginDto nonVerifiedUserDto = modelMapper.map(nonVerifiedUser, LoginDto.class);
        return nonVerifiedUserDto;
    }
}
