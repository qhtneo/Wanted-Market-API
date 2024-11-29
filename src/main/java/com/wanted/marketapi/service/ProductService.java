package com.wanted.marketapi.service;

import com.wanted.marketapi.domain.Product;
import com.wanted.marketapi.entity.ProductEntity;
import com.wanted.marketapi.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper mapper;

    public List<Product> getAllProducts() {
        return productRepository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }

    public Product getProductById(UUID id) {
        return productRepository.findById(id)
                .map(mapper::toDomain)
                .orElse(null);
    }

    // TODO DTO 만들어서 리턴
    public Product addProduct(Product product) {
        ProductEntity productEntity = mapper.toEntity(product);
        productRepository.save(productEntity);

        return product;
    }
}
