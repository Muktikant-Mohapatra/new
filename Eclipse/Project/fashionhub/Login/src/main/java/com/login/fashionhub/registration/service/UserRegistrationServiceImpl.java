package com.login.fashionhub.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.login.fashionhub.login.bo.LoginCredentialsBo;
import com.login.fashionhub.registration.bo.UserDetailsBO;
import com.login.fashionhub.registration.dto.UserDetailsDTO;
import com.login.fashionhub.registration.repository.UserRepositoryRepo;
@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Autowired
	private UserRepositoryRepo userRepository;
	@Autowired
	private BCryptPasswordEncoder encoder;
	@Override
	public String registerMember(UserDetailsDTO userDto) {
       
		UserDetailsBO userBo=new UserDetailsBO();
        userBo.setName(userDto.getName());
        userBo.setGender(userDto.getGender());
        userBo.setDob(userDto.getDob());
        userBo.setPhone(userDto.getPhone());
       LoginCredentialsBo loginCredential=new LoginCredentialsBo();
       loginCredential.setEmail(userDto.getEmail());
       loginCredential.setPassword(encoder.encode(userDto.getPassword()));
       userBo.setLoginCredential(loginCredential);
        /*
		 * DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/mm/yyyy"); LocalDate
		 * date=LocalDate.now();
		 */
        //userBo.setAge(date-userDto.getDob());
        if (userBo!=null) {
        	
        	UserDetailsBO saveUser = userRepository.save(userBo);
			if (saveUser!=null) {
				return "Successful";
			}
		}
		return "unsuccessful";
	}

}
