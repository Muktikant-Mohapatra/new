package com.swarajpackersmovers.user.registration.dao;

import com.swarajpackersmovers.user.enums.Active;
import com.swarajpackersmovers.user.registration.dto.AdminRegistrationDto;
import com.swarajpackersmovers.user.registration.dto.UserRegistrationDto;
import com.swarajpackersmovers.user.registration.entity.AdminRegistrationDetailsEntity;
import com.swarajpackersmovers.user.registration.entity.UserRegistrationDetailsEntity;
import com.swarajpackersmovers.user.registration.entity.MasterUserEntity;
import com.swarajpackersmovers.user.registration.repository.RegistrationRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class RegistrationDaoImpl implements RegistrationDao{
    @Autowired
    private RegistrationRepository<UserRegistrationDetailsEntity> userRegistrationRepository;
    @Autowired
    private RegistrationRepository<AdminRegistrationDetailsEntity> adminRegistrationRepository;
    @Autowired
    private ModelMapper mapper;
    @Override
    @Transactional
    public UserRegistrationDto createUserMember(UserRegistrationDto requestedRegDto) {

        MasterUserEntity requestedUserRoleEntity = mapper.map(requestedRegDto, MasterUserEntity.class);
        UserRegistrationDetailsEntity requestedUserEntity=mapper.map(requestedRegDto,UserRegistrationDetailsEntity.class);
        UserRegistrationDetailsEntity registeredUserEntity = userRegistrationRepository.save(requestedUserEntity);
        UserRegistrationDto registeredUserDto = mapper.map(registeredUserEntity, UserRegistrationDto.class);
        return registeredUserDto;
    }

    @Override
    @Transactional
    public AdminRegistrationDto createAdminMember(AdminRegistrationDto requestedRegAdminDto) {
        MasterUserEntity requestedAdminRoleEntity = mapper.map(requestedRegAdminDto, MasterUserEntity.class);
        AdminRegistrationDetailsEntity requestedAdminEntity=mapper.map(requestedRegAdminDto, AdminRegistrationDetailsEntity.class);
        requestedAdminEntity.setIsActive(Active.INACTIVE);
        AdminRegistrationDetailsEntity registeredAdminEntity = adminRegistrationRepository.save(requestedAdminEntity);
        AdminRegistrationDto registeredAdminDto = mapper.map(registeredAdminEntity, AdminRegistrationDto.class);
        return registeredAdminDto;
    }
}
