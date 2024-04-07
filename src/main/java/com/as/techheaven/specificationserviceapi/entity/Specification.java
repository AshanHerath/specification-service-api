package com.as.techheaven.specificationserviceapi.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "specification")
@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Specification {

    @Id
    private String id;
    private long categoryId;
    private String spec;

}
