package com.swarajpackersmovers.user.controller;

import com.swarajpackersmovers.user.registration.dto.AdminRegistrationDto;
import com.swarajpackersmovers.user.registration.dto.UserRegistrationDto;
import com.swarajpackersmovers.user.registration.request.AdminRegistrationRequestModel;
import com.swarajpackersmovers.user.registration.request.UserRegistrationRequestModel;
import com.swarajpackersmovers.user.registration.response.AdminRegistrationResponseModel;
import com.swarajpackersmovers.user.registration.response.UserRegistrationResponseModel;
import com.swarajpackersmovers.user.registration.service.RegistrationService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
@RestController
@RequestMapping("/register")
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;
    @Autowired
    private ModelMapper mapper;

    private static final Logger logger= LoggerFactory.getLogger(RegistrationController.class);

    @PostMapping(value = "/user",consumes = {MediaType.APPLICATION_JSON_VALUE,
                             MediaType.APPLICATION_XML_VALUE},
                 produces ={MediaType.APPLICATION_JSON_VALUE,
                         MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<UserRegistrationResponseModel> registerUser(@Valid @RequestBody UserRegistrationRequestModel requestModel) {
        logger.debug("Requested Json or Xml Payload data for user registration {} ",requestModel);
        UserRegistrationDto requestedRegUserDto = mapper.map(requestModel, UserRegistrationDto.class);
        UserRegistrationDto registeredUserDto = registrationService.becomeUserMember(requestedRegUserDto);
        logger.debug("Registered user registration data from Service layer {} ",requestModel);
        UserRegistrationResponseModel responseModel = mapper.map(registeredUserDto, UserRegistrationResponseModel.class);
        logger.debug("Registered user response for Json or Xml Payload {}",requestModel);
        return new ResponseEntity<UserRegistrationResponseModel>(responseModel, HttpStatus.CREATED);
    }

    @PostMapping(value = "/admin",consumes = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE},
            produces ={MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<AdminRegistrationResponseModel> registerAdmin(@Valid @RequestBody AdminRegistrationRequestModel requestModel) {
        logger.debug("Requested Json or Xml Payload data for Admin registration {} ",requestModel);
        AdminRegistrationDto requestedRegAdminDto = mapper.map(requestModel, AdminRegistrationDto.class);
        AdminRegistrationDto registeredAdminDto = registrationService.becomeAdminMember(requestedRegAdminDto);
        logger.debug("Registered Admin registration data from Service layer {} ",requestModel);
        AdminRegistrationResponseModel responseModel = mapper.map(registeredAdminDto, AdminRegistrationResponseModel.class);
        logger.debug("Registered user response for Json or Xml Payload {}",requestModel);
        return new ResponseEntity<AdminRegistrationResponseModel>(responseModel, HttpStatus.CREATED);
    }
}
