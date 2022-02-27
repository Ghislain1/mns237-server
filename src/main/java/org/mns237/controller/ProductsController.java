package org.mns237.controller;

import org.mns237.dao.ProductsRepository;
import org.mns237.entity.Products;
import org.mns237.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.mns237.dao.ProductsRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://idrice24.github.io")
public class ProductsController {
    @Autowired
    private final ProductService productService;
    private final ProductsRepository productsRepository;

    public ProductsController(ProductService productService, ProductsRepository productsRepository) {
        this.productService = productService;
        this.productsRepository = productsRepository;
    }
    // show all products
    @GetMapping("/products")
    public List<Products> getAllProduct(){ return productService.getAllProducts();}

    @GetMapping("/products/{id}")
    public Products getProductById(long id){return productService.getProductsById(id);}
    @PostMapping("/products/add")
    public void addProduct(@RequestBody Products products){ productService.saveProduct(products);}

    // edit product from DB
    @GetMapping("/products/edit/{id}")
    public String showUpdate(@PathVariable("id") long id){
        try {
            Products products = productService.getProductsById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "you have edit the product with id : "+ id;
    }

    // update product from DB
    @PostMapping("/products/update/{id}")
    public String updateProduct(@PathVariable("id") long id, Products products, BindingResult result, Model model){
        if (result.hasErrors()){
            products.setId(id);
            return "wrong id";
        }
        productsRepository.save(products);
        model.addAttribute("products", productsRepository.findAll());
    return "you have update the product with id "+ id;
    }
	
    // delete product from DB
    @GetMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable("id") long id, Model model){
        Products product = productsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("invalid products id:" + id));
        productsRepository.delete(product);
        model.addAttribute("products", productsRepository.findAll());
		System.out.print("you have enter a wrong id: "+ id);
        return "you have delete the product with id: "+ id;
    }

}
