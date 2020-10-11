package com.kmart.loginandregistration.service;

import com.kmart.loginandregistration.dto.UserAddressDto;
import com.kmart.loginandregistration.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface RegistrationService {
    public UserDto registerUser(UserDto userDto);
    public UserAddressDto registerAddress(String id, UserAddressDto addressDto);
}
