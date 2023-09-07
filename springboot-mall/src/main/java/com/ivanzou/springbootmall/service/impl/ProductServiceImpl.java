package com.ivanzou.springbootmall.service.impl;

import com.ivanzou.springbootmall.dao.ProductDao;
import com.ivanzou.springbootmall.dto.ProductRequest;
import com.ivanzou.springbootmall.model.Product;
import com.ivanzou.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }

}
