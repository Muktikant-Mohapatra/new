package com.swarajpackersmovers.user.registration.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.swarajpackersmovers.user.utility.DateDeserializer;

import javax.validation.constraints.*;
import java.util.Date;

public class UserRegistrationRequestModel {
    @JsonFormat(shape = JsonFormat.Shape.STRING)

    @Size(min = 1,max =20 ,message ="First Name at least contain 1 character and At most 20 character" )
    private String firstName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Size(min = 1,max =20 ,message ="Last Name at least contain 1 character and At most 20 character" )
    private String lastName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Size(min=1,max =1 ,message ="Gender must contain 1 character M or F" )
    private String gender;
    @JsonDeserialize(using = DateDeserializer.class)
    @Past(message = "Date Of Birth must be selected from past")
    private Date dateOfBirth;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
    private long phone;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String email;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String password;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @Size(min=4,max =5 ,message ="role must be user or admin" )
    private String role;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserRegistrationRequestModel{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
