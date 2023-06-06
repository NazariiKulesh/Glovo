package com.example.glovo.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("product")
@Data
@Builder
public class ProductEntity {
    @Id
    private long id;
    private String name;
    private int cost;
    private long order;
}
