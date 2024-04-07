package com.as.techheaven.specificationserviceapi.dto.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter

public class RequestSpecificationDto {

    private long categoryId;
    private String spec;

}
