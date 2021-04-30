package org.mns237.dto;

import org.mns237.entity.Products;

import java.util.List;

public interface ProductsDatabase {
    public List<Products> getAllProducts();

    public Products getProductsById(long id);
}
