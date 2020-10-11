package com.swaraj_packers.movers.user.registration.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.swaraj_packers.movers.user.registration.dao.RegistrationDao;
import com.swaraj_packers.movers.user.registration.dto.RegistrationDto;

@Service
public class RegistrationServiceImpl implements RegistrationService {
	@Autowired
	private RegistrationDao regDao;
	@Autowired
	private ModelMapper mapper;
	@Autowired
	private BCryptPasswordEncoder encoder;

	@Override
	public RegistrationDto becomeMember(RegistrationDto requestedRegDto) {
		requestedRegDto.setPassword(encoder.encode(requestedRegDto.getPassword()));
		RegistrationDto registeredUserDto = regDao.createMember(requestedRegDto);
		return registeredUserDto;
	}
}
