package com.example.productservice_fakestoreapi.services;

import com.example.productservice_fakestoreapi.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    public Product getProductById(long id);
    List<Product> getAllProducts();
    Product createProduct();
    Product updateProduct();
    Product replaceProduct();
    void deleteProduct();
}
