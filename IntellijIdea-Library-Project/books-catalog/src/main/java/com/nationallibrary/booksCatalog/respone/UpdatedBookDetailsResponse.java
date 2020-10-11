package com.nationallibrary.booksCatalog.respone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.hateoas.RepresentationModel;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UpdatedBookDetailsResponse extends RepresentationModel {
    private String updatedBookField_name;
    private String updatedBookField_oldValue;
    private String updatedBookField_newValue;
}
