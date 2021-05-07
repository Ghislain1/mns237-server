package org.mns237.controller;

import org.mns237.dao.ProductsRepository;
import org.mns237.service.ProductService;
import org.mns237.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductsController {
    @Autowired
    private final ProductsRepository productsRepository;
    private final ProductService productService;

    public ProductsController(ProductsRepository productsRepository, ProductService productService) {
        this.productsRepository = productsRepository;
        this.productService = productService;
    }

    @GetMapping("/admin/products")
    public List<Products> getAllProduct(){ return productService.getAllProducts();}
    @GetMapping("/admin/products/{id}")
    public Products getProductById(long id){return productService.getProductsById(id);}
    @PostMapping("/admin/products/add")
    public void addProduct(@RequestBody Products products){ productsRepository.save(products);}

}
