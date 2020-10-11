package com.udemy.MicroserviceUserManagement.service;

import com.udemy.MicroserviceUserManagement.model.User;
import com.udemy.MicroserviceUserManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User savaUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        User saveUser = userRepository.save(user);
        return saveUser;
    }

    @Override
    public User findByUsername(String username) {
        User findUser = userRepository.findByUsername(username).orElse(null);
        return findUser;
    }

    @Override
    public List<String> findUsers(List<String> idList) {
        List<String> allUsers = userRepository.findAllByList(idList);
        return allUsers;
    }
}