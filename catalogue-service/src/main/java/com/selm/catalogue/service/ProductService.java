package com.selm.catalogue.service;

import com.selm.catalogue.entity.Product;

import java.util.Optional;

public interface ProductService {
    Iterable<Product> findAllProducts(String filter);

    Product createProduct(String title, String details);

    Optional<Product> findProduct(Integer productId);

    void updateProduct(Integer id, String title, String details);

    void deleteProduct(Integer id);
}
