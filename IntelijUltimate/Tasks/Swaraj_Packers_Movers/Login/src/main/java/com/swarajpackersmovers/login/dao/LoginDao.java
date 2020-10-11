package com.swarajpackersmovers.login.dao;


import com.swarajpackersmovers.login.dto.LoginDto;

public interface LoginDao {
    LoginDto searchUser(String username);
}
