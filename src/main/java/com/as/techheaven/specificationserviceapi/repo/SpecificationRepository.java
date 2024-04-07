package com.as.techheaven.specificationserviceapi.repo;

import com.as.techheaven.specificationserviceapi.entity.Specification;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SpecificationRepository extends MongoRepository<Specification, String> {

    List<Specification> findSpecificationByCategoryId(long categoryId);

}
