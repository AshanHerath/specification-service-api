package com.as.techheaven.specificationserviceapi.service.impl;

import com.as.techheaven.specificationserviceapi.dto.request.RequestSpecificationDto;
import com.as.techheaven.specificationserviceapi.dto.response.ResponseSpecificationDto;
import com.as.techheaven.specificationserviceapi.entity.Specification;
import com.as.techheaven.specificationserviceapi.repo.SpecificationRepository;
import com.as.techheaven.specificationserviceapi.service.SpecificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SpecificationServiceImpl implements SpecificationService {

    private final SpecificationRepository specificationRepository;

    @Override
    public void createSpecification(RequestSpecificationDto dto) {

        Specification specification = Specification.builder().categoryId(dto.getCategoryId()).spec(dto.getSpec()).build();
        specificationRepository.save(specification);

    }

    @Override
    public List<ResponseSpecificationDto> findSpecificationByCategoryId(long categoryId) {
        List<Specification> results = specificationRepository.findSpecificationByCategoryId(categoryId);
        List<ResponseSpecificationDto> responseDtos = new ArrayList<>();

        for (Specification result : results) {
            responseDtos.add(new ResponseSpecificationDto(result.getId(), result.getCategoryId(), result.getSpec()
            ));
        }

        return responseDtos;
    }

    @Override
    public void saveSpecifications(List<RequestSpecificationDto> dtos) {
        List<Specification> specifications = new ArrayList<>();
        for (RequestSpecificationDto dto : dtos) {
            Specification specification = Specification.builder().categoryId(dto.getCategoryId()).spec(dto.getSpec()).build();
            specifications.add(specification);
        }
        specificationRepository.saveAll(specifications);
    }
}
