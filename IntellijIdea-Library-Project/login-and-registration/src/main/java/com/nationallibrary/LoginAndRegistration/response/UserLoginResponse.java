package com.nationallibrary.LoginAndRegistration.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.hateoas.RepresentationModel;
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class UserLoginResponse extends RepresentationModel {
    private String name;
    private String email;
}
