package com.workspace.service;

import com.workspace.model.Product;
import com.workspace.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductByCode(String code){
        return productRepository.findByProductCode(code);
    }
}
