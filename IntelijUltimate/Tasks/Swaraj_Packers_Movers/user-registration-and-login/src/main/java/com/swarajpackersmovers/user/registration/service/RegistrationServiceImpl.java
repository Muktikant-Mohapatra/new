package com.swarajpackersmovers.user.registration.service;

import com.swarajpackersmovers.user.registration.dao.RegistrationDao;
import com.swarajpackersmovers.user.registration.dto.AdminRegistrationDto;
import com.swarajpackersmovers.user.registration.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService{
    @Autowired
    private RegistrationDao regDao;
    @Autowired
    private BCryptPasswordEncoder encoder;
    @Override
    public UserRegistrationDto becomeUserMember(UserRegistrationDto requestedRegDto) {
            requestedRegDto.setPassword(encoder.encode(requestedRegDto.getPassword()));
            UserRegistrationDto registeredUserDto = regDao.createUserMember(requestedRegDto);
            return registeredUserDto;

    }

    @Override
    public AdminRegistrationDto becomeAdminMember(AdminRegistrationDto requestedRegAdminDto) {
        requestedRegAdminDto.setPassword(encoder.encode(requestedRegAdminDto.getPassword()));
        AdminRegistrationDto registeredAdminDto = regDao.createAdminMember(requestedRegAdminDto);
        return registeredAdminDto;
    }
}
