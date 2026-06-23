package com.dhiraj.product.controller;

import com.dhiraj.product.entity.Product;
import com.dhiraj.product.repository.ProductRepository;
import com.dhiraj.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/saveProduct")
    public Product saveProduct(@RequestBody Product product) {
        // Logic to save the product to the database
        return productService.saveProduct(product);
    }

}
