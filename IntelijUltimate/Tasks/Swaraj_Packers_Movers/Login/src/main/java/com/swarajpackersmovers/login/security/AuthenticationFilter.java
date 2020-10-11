package com.swarajpackersmovers.login.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.swarajpackersmovers.login.dto.LoginDto;
import com.swarajpackersmovers.login.request.LoginRequestModel;
import com.swarajpackersmovers.login.service.AuthenticateService;
import com.swarajpackersmovers.login.service.LoginService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private LoginService loginService;
    private AuthenticateService authenticateService;
    private Environment environment;

    @Autowired
    public AuthenticationFilter(LoginService loginService,AuthenticateService authenticateService, Environment environment,AuthenticationManager authenticationManager) {
        this.loginService=loginService;
        this.authenticateService = authenticateService;
        this.environment = environment;
        super.setAuthenticationManager(authenticationManager);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        List<GrantedAuthority> roles=new ArrayList<>();
        try
        {
            LoginRequestModel creds=new ObjectMapper().readValue(request.getInputStream(),LoginRequestModel.class);
            roles.add(new SimpleGrantedAuthority(creds.getRole()));
            return getAuthenticationManager().
                    authenticate(
                            new UsernamePasswordAuthenticationToken(
                                                                    creds.getEmail(),
                                                                    creds.getPassword(),
                                                                    roles));
        }catch (IOException e){
           throw new RuntimeException();
        }
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        String username = ((User) authResult.getPrincipal()).getUsername();
        LoginDto userDetailsByEmail= loginService.getUserDetailsByEmail(username);
        String token= Jwts.builder()
                        .setSubject(userDetailsByEmail.getId()+","+userDetailsByEmail.getRole())
                         .setExpiration(new Date(System.currentTimeMillis()+Long.parseLong(environment.getProperty("token.expiration_time"))))
                         .signWith(SignatureAlgorithm.HS512,environment.getProperty("token.secret"))
                         .compact();
        response.addHeader(environment.getProperty("token.header.name"),environment.getProperty("token.header.prefix")+token);
        response.addHeader("userId",userDetailsByEmail.getId());
    }
}
