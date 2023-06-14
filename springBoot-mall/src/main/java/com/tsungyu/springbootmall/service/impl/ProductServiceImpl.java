package com.tsungyu.springbootmall.service.impl;

import com.tsungyu.springbootmall.dao.ProductDao;
import com.tsungyu.springbootmall.model.Product;
import com.tsungyu.springbootmall.service.ProductService;
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
}
