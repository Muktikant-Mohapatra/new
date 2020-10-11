package com.swarajpackersmovers.user.registration.dao;

import com.swarajpackersmovers.user.registration.dto.AdminRegistrationDto;
import com.swarajpackersmovers.user.registration.dto.UserRegistrationDto;

public interface RegistrationDao {
    UserRegistrationDto createUserMember(UserRegistrationDto requestedRegDto);

    AdminRegistrationDto createAdminMember(AdminRegistrationDto requestedRegAdminDto);
}
