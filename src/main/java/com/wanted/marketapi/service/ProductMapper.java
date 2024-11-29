package com.wanted.marketapi.service;

import com.wanted.marketapi.domain.Product;
import com.wanted.marketapi.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {
    Product toDomain(ProductEntity entity);
    ProductEntity toEntity(Product product);
}
