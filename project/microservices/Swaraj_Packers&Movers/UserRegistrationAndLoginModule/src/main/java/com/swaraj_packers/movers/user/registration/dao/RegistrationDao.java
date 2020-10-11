package com.swaraj_packers.movers.user.registration.dao;

import com.swaraj_packers.movers.user.registration.dto.RegistrationDto;

public interface RegistrationDao {

	RegistrationDto createMember(RegistrationDto userRegistrationDto);

}
