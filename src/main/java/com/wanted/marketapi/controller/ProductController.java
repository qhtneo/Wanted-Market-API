package com.wanted.marketapi.controller;

import com.wanted.marketapi.entity.ProductEntity;
import com.wanted.marketapi.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<ProductEntity> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ProductEntity getProductById(@PathVariable UUID id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public ProductEntity addProduct(@RequestBody ProductEntity productEntity) {
        return productService.addProduct(productEntity);
    }
}
