package com.udemy.MicroserviceCourseManagement.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "TRANSACTION")
public class Transaction implements IModel {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "courseId",referencedColumnName = "id")
    private Course course;
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "DATE_OF_ISSUE")
    private Date dateOfIssue;
}
