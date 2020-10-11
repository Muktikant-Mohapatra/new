package com.swarajpackersmovers.user.registration.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.swarajpackersmovers.user.enums.Active;
import com.swarajpackersmovers.user.utility.DateDeserializer;

import java.util.Date;

public class AdminRegistrationResponseModel {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String id;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String firstName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String lastName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String gender;
    @JsonDeserialize(using = DateDeserializer.class)
    private Date dateOfBirth;
    @JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
    private long phone;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String email;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String password;

    private Active isActive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public void setPhone(long phone) {
        this.phone = phone;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Active getIsActive() {
        return isActive;
    }

    public void setIsActive(Active isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "AdminRegistrationResponseModel{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
