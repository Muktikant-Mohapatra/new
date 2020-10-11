package com.spring.qualifier.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service("constructor-service")
public class ConstructorServiceImpl implements GreetingService {
    public static final String HELLO_GREET="Constructor service";
    @Override
    public String greeting() {
        return HELLO_GREET;
    }
}
