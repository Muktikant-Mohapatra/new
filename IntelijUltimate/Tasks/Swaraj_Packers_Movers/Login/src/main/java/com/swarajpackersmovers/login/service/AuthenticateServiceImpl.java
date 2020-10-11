package com.swarajpackersmovers.login.service;


import com.swarajpackersmovers.login.dao.LoginDao;
import com.swarajpackersmovers.login.dto.LoginDto;
import com.swarajpackersmovers.login.entity.LoginEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthenticateServiceImpl implements AuthenticateService{
    private LoginDao loginDao;
    private ModelMapper mapper;
    @Autowired
    public AuthenticateServiceImpl(LoginDao loginDao, ModelMapper mapper) {
        this.loginDao = loginDao;
        this.mapper = mapper;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<GrantedAuthority> role=new ArrayList();
        LoginDto nonVerifiedUserDto=loginDao.searchUser(username);
        LoginEntity nonVerifiedUserEntity = mapper.map(nonVerifiedUserDto, LoginEntity.class);
        SimpleGrantedAuthority simpleGrantedAuthorityRole = new SimpleGrantedAuthority(nonVerifiedUserEntity.getRole());
        role.add(simpleGrantedAuthorityRole);
        if (nonVerifiedUserDto==null)throw new UsernameNotFoundException(username);
        return new User(nonVerifiedUserEntity.getEmail(),nonVerifiedUserEntity.getPassword(),role);
    }
    /**
     * if (role.get(1).equals("admin")) {
     *             nonVerifiedUserDto = loginDao.searchUser(username);
     *             nonVerifiedUserEntity = mapper.map(nonVerifiedUserDto, LoginEntity.class);
     *             simpleGrantedAuthorityRole = new SimpleGrantedAuthority(nonVerifiedUserEntity.getRole());
     *             role.add(simpleGrantedAuthorityRole);
     *         }else if(role.get(1).equals("user")){
     *             nonVerifiedUserDto = loginDao.searchUser(username);
     *             nonVerifiedUserEntity =mapper.map(nonVerifiedUserDto, LoginEntity.class);
     *             simpleGrantedAuthorityRole = new SimpleGrantedAuthority(nonVerifiedUserEntity.getRole());
     *             role.add(simpleGrantedAuthorityRole);
     *         }
     */
}
