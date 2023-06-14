package com.tsungyu.springbootmall.dao;

import com.tsungyu.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
