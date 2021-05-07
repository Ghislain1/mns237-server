package org.mns237.service;

import org.mns237.entity.Products;

import java.util.List;

public interface ProductService {
    List<Products> getAllProducts();

    Products getProductsById(long id);
}
