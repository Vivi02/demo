package com.example.demo.mapper;

import com.example.demo.model.Order_Detail;
import com.example.demo.model.Product;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDetailMapper {
    public void insertDetail(Order_Detail order_detail);

    public Product findProductById(String id);
    public void updateItem(Order_Detail order_detail);
    public int findStatusByOrderNo(String order_no);
}
