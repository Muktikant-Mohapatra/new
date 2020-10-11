package com.kmart.loginandregistration.dto;

import com.kmart.loginandregistration.enums.Gender;
import com.kmart.loginandregistration.enums.Role;
import lombok.*;

import java.util.Date;
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Date dob;
    private long number;
    private Gender gender;
    private Role role;
}
