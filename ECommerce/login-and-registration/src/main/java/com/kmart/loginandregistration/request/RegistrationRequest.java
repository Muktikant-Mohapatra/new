package com.kmart.loginandregistration.request;

import com.kmart.loginandregistration.enums.Gender;
import com.kmart.loginandregistration.enums.Role;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Date dob;
    private long number;
    private Gender gender;
    private Role role;
}
