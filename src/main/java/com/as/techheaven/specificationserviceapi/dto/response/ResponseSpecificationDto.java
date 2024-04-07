package com.as.techheaven.specificationserviceapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseSpecificationDto {

    private String id;
    private long categoryId;
    private String spec;

}
