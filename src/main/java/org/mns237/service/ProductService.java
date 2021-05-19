package org.mns237.service;

import org.mns237.entity.Products;

import java.util.List;

public interface ProductService {
    public List<Products> getAllProducts();

    public Products getProductsById(long id);

    void saveProduct(Products products);

    void deleteProducts(long id);
}

