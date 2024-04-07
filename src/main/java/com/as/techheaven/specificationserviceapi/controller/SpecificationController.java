package com.as.techheaven.specificationserviceapi.controller;

import com.as.techheaven.specificationserviceapi.dto.request.RequestSpecificationDto;
import com.as.techheaven.specificationserviceapi.dto.response.ResponseSpecificationDto;
import com.as.techheaven.specificationserviceapi.service.SpecificationService;
import com.as.techheaven.specificationserviceapi.util.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/specifications")
@RequiredArgsConstructor
public class SpecificationController {

    private final SpecificationService specificationService;

    @PostMapping
    private ResponseEntity<StandardResponse> createSpecification(@RequestBody RequestSpecificationDto dto){

        specificationService.createSpecification(dto);
        return new ResponseEntity<>(new StandardResponse(201, "Specification was created successfully", dto.getSpec()), HttpStatus.CREATED);

    }

    @GetMapping("/byCategory/{categoryId}")
    @ResponseStatus(HttpStatus.OK)
    private List<ResponseSpecificationDto> getSpecificationsByCategoryId(@PathVariable long categoryId){
        return specificationService.findSpecificationByCategoryId(categoryId);
    }

    @PostMapping("/saveList")
    @ResponseStatus(HttpStatus.CREATED)
    private void saveSpecifications(@RequestBody List<RequestSpecificationDto> dtos){
        specificationService.saveSpecifications(dtos);
    }

}
