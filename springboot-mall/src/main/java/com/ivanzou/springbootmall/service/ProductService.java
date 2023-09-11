package com.ivanzou.springbootmall.service;

import com.ivanzou.springbootmall.constant.ProductCategory;
import com.ivanzou.springbootmall.dto.ProductRequest;
import com.ivanzou.springbootmall.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts(ProductCategory category, String search);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
