package com.udemy.MicroserviceUserManagement.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "USER_DETAILS")
public class User {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @Column
    private String name;
    @Column
    private String username;
    @Column
    private String password;
    @Enumerated(value = EnumType.STRING)
    @Column
    private Role role;

}