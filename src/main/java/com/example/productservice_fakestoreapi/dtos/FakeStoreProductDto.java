package com.example.productservice_fakestoreapi.dtos;

import com.example.productservice_fakestoreapi.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private long id;
    private String title;
    private double price;
    private String category;
    private String description;
    private String imageUrl;
}
