package com.swaraj_packers.movers.user.registration.dao;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.swaraj_packers.movers.user.registration.dto.RegistrationDto;
import com.swaraj_packers.movers.user.registration.entity.RegistrationEntity;
import com.swaraj_packers.movers.user.registration.repository.RegistrationRepository;

@Component
public class RegistrationDaoImpl implements RegistrationDao {

	private RegistrationRepository registrationRepository;
	private ModelMapper mapper;

	public RegistrationDaoImpl(RegistrationRepository registrationRepository) {
		super();
		this.registrationRepository = registrationRepository;
	}

	@Override
	public RegistrationDto createMember(RegistrationDto userRegistrationDto) {
		mapper=new ModelMapper();
		RegistrationEntity requestedUserEntity = mapper.map(userRegistrationDto, RegistrationEntity.class);
		RegistrationEntity registeredUserEntity = registrationRepository.save(requestedUserEntity);
		RegistrationDto registeredUserDto = mapper.map(registeredUserEntity, RegistrationDto.class);
		return registeredUserDto;
	}
}
