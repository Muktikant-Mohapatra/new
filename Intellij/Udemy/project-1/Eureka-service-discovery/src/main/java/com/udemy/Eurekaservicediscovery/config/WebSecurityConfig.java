package com.udemy.Eurekaservicediscovery.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableAutoConfiguration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().authorizeRequests().antMatchers("/**","http://localhost:3113/**").permitAll()
                .and().formLogin().loginPage("/service").and()
                //enable basic header authentication
                .httpBasic().and()
                //cross-side request forgery
                .csrf().disable();
    }
}
