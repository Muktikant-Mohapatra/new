package com.nationallibrary.booksCatalog.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.hateoas.RepresentationModel;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AddBookRequest extends RepresentationModel {
    private String name;
    private String author;
    private String publisher;
}
