package com.spring.annotation.profile.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class PrimaryGreetingServiceImpl implements GreetingService {
    public static final String HELLO_GREET="Primary-Hello Guru";
    @Override
    public String greeting() {
        return HELLO_GREET;
    }
}
