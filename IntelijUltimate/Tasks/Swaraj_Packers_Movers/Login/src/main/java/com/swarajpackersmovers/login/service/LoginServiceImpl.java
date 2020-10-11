package com.swarajpackersmovers.login.service;


import com.swarajpackersmovers.login.dao.LoginDao;
import com.swarajpackersmovers.login.dto.LoginDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    private LoginDao loginDao;
    @Autowired
    public LoginServiceImpl(LoginDao loginDao) {
        this.loginDao = loginDao;
    }

    @Override
    public LoginDto getUserDetailsByEmail(String username) {
        LoginDto userDto=loginDao.searchUser(username);
        return userDto;
    }
}
