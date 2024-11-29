package com.wanted.marketapi.service;

import com.wanted.marketapi.domain.Product;
import com.wanted.marketapi.entity.ProductEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-28T22:36:10+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.7 (Amazon.com Inc.)"
)
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toDomain(ProductEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Product.ProductBuilder product = Product.builder();

        product.id( entity.getId() );
        product.name( entity.getName() );
        product.price( entity.getPrice() );
        product.status( entity.getStatus() );

        return product.build();
    }

    @Override
    public ProductEntity toEntity(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        productEntity.setId( product.getId() );
        productEntity.setName( product.getName() );
        productEntity.setPrice( product.getPrice() );
        productEntity.setStatus( product.getStatus() );

        return productEntity;
    }
}
