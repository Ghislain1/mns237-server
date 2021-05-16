package org.mns237.service;

import org.mns237.dao.ProductsRepository;
import org.mns237.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl  implements ProductService{
    @Autowired
    private ProductsRepository productsRepository;

    public ProductServiceImpl(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public List<Products> getAllProducts(){ return productsRepository.findAll(); }

    @Override
    public Products getProductsById(long id){return  productsRepository.findById(id).orElse(null); }


}
