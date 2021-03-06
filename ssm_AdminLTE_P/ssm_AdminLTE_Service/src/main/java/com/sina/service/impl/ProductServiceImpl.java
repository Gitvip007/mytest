package com.sina.service.impl;

import com.sina.dao.ProductDao;
import com.sina.domain.Product;
import com.sina.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    public List<Product> findAll() {
        List<Product> productList = productDao.findAll();
        return productList;
    }
}
