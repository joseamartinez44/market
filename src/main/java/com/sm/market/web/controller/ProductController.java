package com.sm.market.web.controller;

import com.sm.market.domain.Product;
import com.sm.market.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    public List<Product> getAll() {
        return productService.getAll();
    }

    public Optional<List<Product>> getByCategory(int categoryId) {
        return productService.getByCategory(categoryId);
    }

    public Optional<List<Product>> getScarseProducts(int quantity) {
        return productService.getScarseProducts(quantity);
    }

    public Optional<Product> getProduct(int productId) {
        return productService.getProduct(productId);
    }

    public Product save(Product product) {
        return productService.save(product);
    }

    public boolean delete(int productId) {
        return productService.delete(productId);
    }
}
