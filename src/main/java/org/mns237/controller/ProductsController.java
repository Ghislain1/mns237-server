package org.mns237.controller;

import org.mns237.dao.ProductsRepository;
import org.mns237.dto.ProductsDatabase;
import org.mns237.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductsController {
    @Autowired
    private final ProductsRepository productsRepository;
    private final ProductsDatabase productsDatabase;

    public ProductsController(ProductsRepository productsRepository, ProductsDatabase productsDatabase) {
        this.productsRepository = productsRepository;
        this.productsDatabase = productsDatabase;
    }

    @GetMapping("/admin/products")
    public List<Products> getAllProduct(){ return productsDatabase.getAllProducts();}
    @GetMapping("/admin/products/{id}")
    public Products getProductById(long id){return productsDatabase.getProductsById(id);}
    @PostMapping("/admin/products/add")
    public void addProduct(@RequestBody Products products){ productsRepository.save(products);}

}
