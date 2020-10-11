package com.udemy.Microservicelogservice.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "SUMMARY")
public class Summary implements IModel {
    @Id
    private String courseId;
    @Column(updatable = true)
    private Long hitCount;
}
