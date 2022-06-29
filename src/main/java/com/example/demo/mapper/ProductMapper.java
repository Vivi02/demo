package com.example.demo.mapper;

import com.example.demo.model.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    public List<Product> findAllProduct();
    public void insertProduct(Product product);
    public void updateProduct(Product product);
    public void deleteProductById(String id);
    public List<Product> findOrderProduct();
}
