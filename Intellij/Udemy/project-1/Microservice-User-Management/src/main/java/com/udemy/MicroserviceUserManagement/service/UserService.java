package com.udemy.MicroserviceUserManagement.service;

import com.udemy.MicroserviceUserManagement.model.User;

import java.util.List;

public interface UserService {
     User savaUser(User user);

    User findByUsername(String username);

    List<String> findUsers(List<String> idList);
}