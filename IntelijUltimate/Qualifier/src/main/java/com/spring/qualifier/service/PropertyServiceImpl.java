package com.spring.qualifier.service;

import org.springframework.stereotype.Service;

@Service("property-service")
public class PropertyServiceImpl implements GreetingService {
    public static final String HELLO_GREET="Property Service";
    @Override
    public String greeting() {
        return HELLO_GREET;
    }
}
