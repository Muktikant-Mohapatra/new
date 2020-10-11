package com.nationallibrary.booksCatalog.respone;

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
public class AvailableBookDetailsResponse extends RepresentationModel {
public List<AddBookResponse> books;
}
