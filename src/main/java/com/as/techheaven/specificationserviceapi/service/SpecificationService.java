package com.as.techheaven.specificationserviceapi.service;

import com.as.techheaven.specificationserviceapi.dto.request.RequestSpecificationDto;
import com.as.techheaven.specificationserviceapi.dto.response.ResponseSpecificationDto;

import java.util.List;

public interface SpecificationService {

    public void createSpecification(RequestSpecificationDto dto);
    public List<ResponseSpecificationDto> findSpecificationByCategoryId(long categoryId);
    void saveSpecifications(List<RequestSpecificationDto> dtos);

}
