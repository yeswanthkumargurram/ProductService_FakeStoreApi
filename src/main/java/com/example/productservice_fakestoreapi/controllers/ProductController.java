package com.example.productservice_fakestoreapi.controllers;

import com.example.productservice_fakestoreapi.models.Product;
import com.example.productservice_fakestoreapi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") long id){
        return productService.getProductById(id);
        //return new Product();
    }
    @GetMapping()
    public List<Product> getAllProducts(){

        return new ArrayList<>();
    }
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return new Product();
    }

    //Partial Update
    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable("id") long id, @RequestBody Product product){
        return new Product();
    }

    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") long id, @RequestBody Product product){
        return new Product();
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") long id){

    }
}
