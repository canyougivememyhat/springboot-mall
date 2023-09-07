package com.ivanzou.springbootmall.controller;

import com.ivanzou.springbootmall.dto.ProductRequest;
import com.ivanzou.springbootmall.model.Product;
import com.ivanzou.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer productId){
        Product product = productService.getProductById(productId);

        if(product != null){
            return ResponseEntity.status(HttpStatus.OK).body(product);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody @Valid ProductRequest productRequest){
        System.out.println("1");
        Integer productId = productService.createProduct(productRequest);
        System.out.println("2");

        Product product = productService.getProductById(productId);
        System.out.println("3");

        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }
}















