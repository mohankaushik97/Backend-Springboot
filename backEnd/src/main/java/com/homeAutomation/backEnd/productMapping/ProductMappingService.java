package com.homeAutomation.backEnd.productMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductMappingService {
    private final ProductMappingRepository productMappingRepository;

    @Autowired
    public ProductMappingService(ProductMappingRepository productMappingRepository) {
        this.productMappingRepository = productMappingRepository;
    }
}
