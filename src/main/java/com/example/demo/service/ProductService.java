package com.example.demo.service;

import com.example.demo.mapper.ProductMapper;
import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductService {
    private final ProductMapper productMapper;

    @Autowired
    public ProductService(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public List<Product> findAllProduct(){
        return productMapper.findAllProduct();
    }

    public List<Product> findOrderProduct(){
        return productMapper.findOrderProduct();
    }

    public void insertProduct(Product product){
        product.setCreate_time(new Date().getTime());
        productMapper.insertProduct(product);
    }

    public void updateProduct(Product product){
        productMapper.updateProduct(product);
    }

    public void deleteProductById(String id){
        productMapper.deleteProductById(id);
    }
}
