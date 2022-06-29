package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/findAllProduct")
    public List<Product> findAllProduct(){
        return productService.findAllProduct();
    }

    @GetMapping("/findOrderProduct")
    public List<Product> findOrderProduct(){
        return productService.findOrderProduct();
    }

    @PostMapping("/insertProduct")
    public void insertProduct(@RequestBody Product product){
        productService.insertProduct(product);
    }

    @PutMapping("/updateProduct")
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }

    @DeleteMapping("/deleteProductById/{id}")
    public void deleteProductById(@PathVariable String id){
        productService.deleteProductById(id);
    }
}
