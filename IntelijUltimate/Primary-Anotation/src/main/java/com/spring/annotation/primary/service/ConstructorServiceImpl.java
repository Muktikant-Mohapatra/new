package com.spring.annotation.primary.service;

import org.springframework.stereotype.Service;

@Service("constructor-service")
public class ConstructorServiceImpl implements GreetingService {
    public static final String HELLO_GREET="Constructor service";
    @Override
    public String greeting() {
        return HELLO_GREET;
    }
}
