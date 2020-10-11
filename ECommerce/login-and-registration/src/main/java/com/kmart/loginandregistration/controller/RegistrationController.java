package com.kmart.loginandregistration.controller;

import com.kmart.loginandregistration.dto.UserAddressDto;
import com.kmart.loginandregistration.dto.UserDto;
import com.kmart.loginandregistration.request.AddressRegistrationRequest;
import com.kmart.loginandregistration.request.RegistrationRequest;
import com.kmart.loginandregistration.response.AddressRegistrationResponse;
import com.kmart.loginandregistration.response.RegistrationResponse;
import com.kmart.loginandregistration.service.RegistrationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;

@RestController
@RequestMapping("/register")
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    private ModelMapper mapper=new ModelMapper();
    @PostMapping(value = "/users")
    @Consumes({MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<RegistrationResponse> registerUser(@RequestBody RegistrationRequest request){
        UserDto requestDto = mapper.map(request, UserDto.class);
        UserDto registerUser = registrationService.registerUser(requestDto);
        RegistrationResponse response = mapper.map(registerUser, RegistrationResponse.class);
        return ResponseEntity.ok(response);
    }
    @PostMapping(value = "/users/{id}/address")
    public ResponseEntity<AddressRegistrationResponse> registerAddress(@PathVariable("id") String id, @RequestBody AddressRegistrationRequest request){
        UserAddressDto requestDto = mapper.map(request, UserAddressDto.class);
        UserAddressDto registerAddress=registrationService.registerAddress(id,requestDto);
        AddressRegistrationResponse response=mapper.map(registerAddress,AddressRegistrationResponse.class);
        return  ResponseEntity.ok(response);
    }
}
