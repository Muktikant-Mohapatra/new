package com.spring.annotation.primary.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingServiceImpl implements GreetingService {
    public static final String HELLO_GREET="Primary-Hello Guru";
    @Override
    public String greeting() {
        return HELLO_GREET;
    }
}
