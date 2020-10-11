package com.swarajpackersmovers.user.registration.service;

import com.swarajpackersmovers.user.registration.dto.AdminRegistrationDto;
import com.swarajpackersmovers.user.registration.dto.UserRegistrationDto;

public interface RegistrationService {
    UserRegistrationDto becomeUserMember(UserRegistrationDto requestedRegDto);

    AdminRegistrationDto becomeAdminMember(AdminRegistrationDto requestedRegAdminDto);
}
