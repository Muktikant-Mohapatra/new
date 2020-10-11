package com.swaraj_packers_movers.api_gateway.api_gateway.security;

import io.jsonwebtoken.Jwts;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AuthenticationFilter extends BasicAuthenticationFilter {
private Environment environment;

    public AuthenticationFilter(AuthenticationManager authenticationManager, Environment environment) {
        super(authenticationManager);
        this.environment = environment;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        String authorizationHeader= request.getHeader(environment.getProperty("authorization.token.header.name"));
        if (authorizationHeader==null || !authorizationHeader.startsWith(environment.getProperty("authorization.token.header.prefix"))){
            chain.doFilter(request,response);
            return;
        }
        UsernamePasswordAuthenticationToken authentication=getAuthentication(request);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        chain.doFilter(request,response);
    }

    private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
        String userId=null;
        List<GrantedAuthority> role=new ArrayList<>();
        String authorizationHeader=request.getHeader(environment.getProperty("authorization.token.header.name"));
        if (authorizationHeader==null)return null;
        String token=authorizationHeader.replace(environment.getProperty("authorization.token.header.prefix"),"");
        String user= Jwts
                           .parser()
                           .setSigningKey(environment.getProperty("token.secret"))
                           .parseClaimsJws(token)
                           .getBody()
                           .getSubject();
        if (user==null){
            return null;
        }
        else {
           String[] userDetails=user.split(",");
           for(String str:userDetails){
               if (str.equalsIgnoreCase("user")||str.equalsIgnoreCase("admin")){
                   role.add(new SimpleGrantedAuthority(str));
               }else{
                   userId=str;
               }
           }
        }
        return new UsernamePasswordAuthenticationToken(userId,null,role);
    }
}
