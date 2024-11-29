package com.wanted.marketapi.service;

import com.wanted.marketapi.entity.ProductEntity;
import com.wanted.marketapi.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    public ProductEntity getProductById(UUID id) {
        return productRepository.findById(id).orElse(null);
    }

    public ProductEntity addProduct(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }
}
