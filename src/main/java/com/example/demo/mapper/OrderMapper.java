package com.example.demo.mapper;

import com.example.demo.model.Order;
import com.example.demo.model.Order_Detail;
import com.example.demo.model.Product;
import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface OrderMapper {
    public List<Order> findAllOrder();
    public void insertOrder(Order order);
    public void updateOrder(Order order);
    public void deleteOrderById(String id);
    public void updateStatus(Order order);

     public User findUserById(String id);
     public int findStatusById(String id);
}
