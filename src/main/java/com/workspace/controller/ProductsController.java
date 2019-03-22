package com.workspace.controller;

import com.workspace.model.Product;
import com.workspace.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ProductsController {

    private ProductService productService;

    @Autowired
    public ProductsController(ProductService userService) {
        this.productService = userService;
    }

    @GetMapping("products")
    @PreAuthorize("hasRole('USER')")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @RequestMapping("products/{code}")
    @PreAuthorize("hasRole('USER')")
    public Product getProductByCode(@PathVariable String code){
        return productService.getProductByCode(code);
    }

}
