package com.nationallibrary.LoginAndRegistration.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.hateoas.RepresentationModel;

import java.util.List;
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RegisteredUsersDetailsResponse extends RepresentationModel {
    private List<UserLoginResponse> listUsers;
}
