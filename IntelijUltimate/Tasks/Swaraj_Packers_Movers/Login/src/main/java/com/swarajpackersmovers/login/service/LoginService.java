package com.swarajpackersmovers.login.service;


import com.swarajpackersmovers.login.dto.LoginDto;

public interface LoginService {
    LoginDto getUserDetailsByEmail(String username);
}
