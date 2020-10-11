package com.udemy.MicroserviceCourseManagement.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "COURSE")
public class Course implements IModel{
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @Column
    private String title;
    @Column
    private String author;
    @Column
    private String catagory;
    @Column(name = "DATE_OF_PUBLISH")
    private Date publishDate;
}
