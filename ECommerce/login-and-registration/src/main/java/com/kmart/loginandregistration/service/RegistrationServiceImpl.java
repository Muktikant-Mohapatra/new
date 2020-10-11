package com.kmart.loginandregistration.service;

import com.kmart.loginandregistration.dto.UserAddressDto;
import com.kmart.loginandregistration.dto.UserDto;
import com.kmart.loginandregistration.entity.AddressEntity;
import com.kmart.loginandregistration.entity.UserEntity;
import com.kmart.loginandregistration.repository.AddressRepository;
import com.kmart.loginandregistration.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    //@Autowired
    //private UserDao userDao;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    //private AddressDao addressDao;
     private AddressRepository addressRepository;
    @Autowired
    private BCryptPasswordEncoder encoder;

    private ModelMapper mapper=new ModelMapper();
    @Override
    public UserDto registerUser(UserDto userDto) {
        UserEntity user = mapper.map(userDto, UserEntity.class);
        if (userRepository.existsByEmail(user.getEmail())) {
            UserEntity registeredUser = userRepository.save(user);
            UserDto registeredUserDto = mapper.map(registeredUser, UserDto.class);
            return registeredUserDto;
        }else{
            return null;
        }
    }

    @Override
    public UserAddressDto registerAddress(String id, UserAddressDto addressDto) {

        if (userRepository.existsById(id)){
            AddressEntity address=mapper.map(addressDto,AddressEntity.class);
            //address.setUser_id(id);
            addressRepository.save(address);
        }else{

        }
        return null;
    }
}
