package com.spring.qualifier.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO_GREET="Hello Guru";
    @Override
    public String greeting() {
        return HELLO_GREET;
    }
}
