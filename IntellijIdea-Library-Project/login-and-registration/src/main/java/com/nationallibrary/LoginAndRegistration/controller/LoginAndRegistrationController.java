package com.nationallibrary.LoginAndRegistration.controller;

import com.nationallibrary.LoginAndRegistration.response.RegisteredUsersDetailsResponse;
import com.nationallibrary.LoginAndRegistration.response.UserDetailsUpdatedResponse;
import com.nationallibrary.LoginAndRegistration.response.UserLoginResponse;
import com.nationallibrary.LoginAndRegistration.response.UserRegistrationResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/NationalLobrary")
public class LoginAndRegistrationController {
    @PostMapping("/login")
    public ResponseEntity<UserLoginResponse> userLogin(){
        return  null;
    }
    @PostMapping
    public ResponseEntity<UserRegistrationResponse> registerUser(){
        return null;
    }
    @GetMapping
    public ResponseEntity<RegisteredUsersDetailsResponse> getAllUsers(){
        return null;
    }
    @GetMapping
    public ResponseEntity<UserRegistrationResponse> getUser(){
        return null;
    }
    @PutMapping
    public ResponseEntity<UserDetailsUpdatedResponse> updateUser(){
        return null;
    }
    @DeleteMapping
    public ResponseEntity deleteUser(){
        return null;
    }
}
