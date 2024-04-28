package com.example.productservice_fakestoreapi.services;

import com.example.productservice_fakestoreapi.dtos.FakeStoreProductDto;
import com.example.productservice_fakestoreapi.models.Category;
import com.example.productservice_fakestoreapi.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

// we can use @Component or @Service both works same
@Service
public class FakeStoreProductServiceImpl implements ProductService{

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Product getProductById(long id) {
        //call the fakestore api to get the product with given id
        FakeStoreProductDto fakeStoreProductDto =
                restTemplate.getForObject("https://fakestoreapi.com/products/"+ id, FakeStoreProductDto.class);

        //convert FakeStoreProductDto to product object.
        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setPrice(fakeStoreProductDto.getPrice());
        Category category = new Category();
        category.setTitle(fakeStoreProductDto.getCategory());
        product.setCategory(category);
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setImageUrl(fakeStoreProductDto.getImageUrl());
        return product;
    }

    @Override
    public List<Product> getAllProducts() {

        return null;
    }

    @Override
    public Product createProduct() {
        return null;
    }

    @Override
    public Product updateProduct() {
        return null;
    }

    @Override
    public Product replaceProduct() {
        return null;
    }

    @Override
    public void deleteProduct() {

    }
}
