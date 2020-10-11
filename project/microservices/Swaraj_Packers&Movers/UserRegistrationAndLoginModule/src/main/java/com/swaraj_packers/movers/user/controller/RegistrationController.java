package com.swaraj_packers.movers.user.controller;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swaraj_packers.movers.user.registration.dto.RegistrationDto;
import com.swaraj_packers.movers.user.registration.request.RegistrationRequestModel;
import com.swaraj_packers.movers.user.registration.response.RegistrationResponseModel;
import com.swaraj_packers.movers.user.registration.service.RegistrationService;

@RestController
@RequestMapping("/users")
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;
	private ModelMapper mapper;

	@PostMapping
	public ResponseEntity<RegistrationResponseModel> register(
			@Valid @RequestBody RegistrationRequestModel requestModel) {
		mapper = new ModelMapper();
		RegistrationDto requestedRegUserDto = mapper.map(requestModel, RegistrationDto.class);

		mapper = new ModelMapper();
		RegistrationDto registeredUserDto = registrationService.becomeMember(requestedRegUserDto);
		RegistrationResponseModel responseModel = mapper.map(registeredUserDto, RegistrationResponseModel.class);
		;
		return new ResponseEntity<RegistrationResponseModel>(responseModel, HttpStatus.CREATED);
	}
}
