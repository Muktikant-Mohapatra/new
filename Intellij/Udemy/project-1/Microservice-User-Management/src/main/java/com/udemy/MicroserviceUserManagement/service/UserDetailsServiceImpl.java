package com.udemy.MicroserviceUserManagement.service;

import com.udemy.MicroserviceUserManagement.model.User;
import com.udemy.MicroserviceUserManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userReposiroty;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //Get user details from provided username
        User user = userReposiroty.findByUsername(username).orElse(null);
        if (user == null)
            throw new UsernameNotFoundException(username);
        Set<GrantedAuthority> authority = new HashSet<>();
        //Get Authority name
        authority.add(new SimpleGrantedAuthority(user.getRole().name()));

        return new org.springframework.security.core.userdetails.User(username, user.getPassword(), authority);
    }
}