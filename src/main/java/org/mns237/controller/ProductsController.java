package org.mns237.controller;

import org.mns237.dao.ProductsRepository;
import org.mns237.service.ProductService;
import org.mns237.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
    // show all products
    @GetMapping("/admin/products")
    public List<Products> getAllProduct(){ return productService.getAllProducts();}

    //show product by id
    @GetMapping("/admin/products/{id}")
    public Products getProductById(long id){return productService.getProductsById(id);}

    // add product in DB
    @PostMapping("/admin/products/add")
    public void addProduct(@RequestBody Products products){ productsRepository.save(products);}

    // edit product from DB
    @GetMapping("admin/products/edit/{id}")
    public String showUpdate(@PathVariable("id") long id){
        try {
            Products products = productService.getProductsById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "you have edit the product with id : "+ id;
    }

    // update product from DB
    @PostMapping("/admin/products/update/{id}")
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
    @GetMapping("/admin/products/delete/{id}")
    public String deleteProduct(@PathVariable("id") long id, Model model){
        Products product = productsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("invalid products id:" + id));
        productsRepository.delete(product);
        model.addAttribute("products", productsRepository.findAll());
		System.out.print("you have enter a wrong id: "+ id);
        return "you have delete the product with id: "+ id;
    }

}
