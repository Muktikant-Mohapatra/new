package com.spring.qualifier.service;

import org.springframework.stereotype.Service;

@Service("setter-service")
public class SetterServiceImpl implements GreetingService {
    public static final String HELLO_GREET="setter-service";
    @Override
    public String greeting() {
        return HELLO_GREET;
    }
}
