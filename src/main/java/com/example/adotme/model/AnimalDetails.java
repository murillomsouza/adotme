package com.example.adotme.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Indexed;

@Document(collation = "animalDetails")
@Getter @Setter
public class AnimalDetails {

    @Id
    private String Id;

    @Indexed(unique = true)
    private Long animalId;
    private String description;
}
