package com.angularWithSpringboot.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid",strategy = "uuid")
    private String  id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "CREATION_DATE")
    @JsonFormat(pattern = "dd/mm/yyyy")
    private LocalDate date;
    @Column(name = "COMPLETED")
    private boolean completed;
}
