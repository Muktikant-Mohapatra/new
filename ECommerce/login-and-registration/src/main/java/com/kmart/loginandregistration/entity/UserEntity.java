package com.kmart.loginandregistration.entity;

import com.kmart.loginandregistration.enums.Gender;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "USER_DETAILS")
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column
    private long number;
    @OneToMany(cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH},mappedBy = "user")
    private List<AddressEntity> address;
}
