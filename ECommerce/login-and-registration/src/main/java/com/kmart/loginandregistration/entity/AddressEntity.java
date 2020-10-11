package com.kmart.loginandregistration.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "ADDRESS")
public class AddressEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
   // @Column(updatable = false,insertable = false)
    private String id;
    @Column
    private String country;
    @Column
    private String state;
    @Column
    private String city;
    @Column
    private long pincode;
    @Column
    private String street;
    @Column
    private String landmark;
   /* @Column(updatable = false)
    private String user_id;*/
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(
            name = "USER_ADDRESS",
            joinColumns = {@JoinColumn(name = "ADDRESS_ID")},
            inverseJoinColumns = {@JoinColumn(name = "USER_ID")}
            )
    private UserEntity user;
}
