package com.spring.annotation.profile.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("property-service")
@Profile("es")
@Primary
public class PropertyServiceImpl implements GreetingService {
    public static final String HELLO_GREET="Property Service";
    @Override
    public String greeting() {
        return HELLO_GREET;
    }
}
