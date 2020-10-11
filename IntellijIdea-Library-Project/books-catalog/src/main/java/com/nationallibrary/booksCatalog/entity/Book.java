package com.nationallibrary.booksCatalog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "BOOKS")
public class Book {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy ="org.hibernate.id.UUIDGenerator" )
    private String id;
    @Column
    private String name;
    @Column
    private String author;
    @Column
    private String publisher;

}
