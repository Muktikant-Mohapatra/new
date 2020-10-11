package com.nationallibrary.LoginAndRegistration.response;

import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import java.util.Date;
@Data
public class UserRegistrationResponse extends RepresentationModel {
    private String name;
    private String fName;
    private Date dateOfBirth;
    private Long phone;
    private String email;
    private String address;
}
