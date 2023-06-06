package com.example.glovo.convertor;

import com.example.glovo.entity.OrderEntity;
import com.example.glovo.entity.ProductEntity;
import com.example.glovo.model.Order;
import com.example.glovo.model.Product;

public class ProductConvertor {

    public static Product productEntityToProduct(ProductEntity productEntity){
        return Product.builder()
                .id(productEntity.getId())
                .cost(productEntity.getCost())
                .name(productEntity.getName()).build();

    }
    public static ProductEntity productToProductEntity(Product product){
        return ProductEntity.builder().id(product.getId())
                .cost(product.getCost())
                .name(product.getName())
                .build();

    }
}
