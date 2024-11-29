package com.wanted.marketapi.service;

import com.wanted.marketapi.domain.Product;
import com.wanted.marketapi.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toDomain(ProductEntity entity);
    ProductEntity toEntity(Product product);
}
