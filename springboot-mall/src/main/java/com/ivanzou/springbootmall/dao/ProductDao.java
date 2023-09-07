package com.ivanzou.springbootmall.dao;

import com.ivanzou.springbootmall.dto.ProductRequest;
import com.ivanzou.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
}
