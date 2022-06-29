package com.example.demo.service;

import com.example.demo.mapper.OrderMapper;
import com.example.demo.model.Order;
import com.example.demo.model.Order_Detail;
import com.example.demo.model.Product;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    private final OrderMapper orderMapper;

    @Autowired
    public OrderService(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    public List<Order> findAllOrder(){
        return orderMapper.findAllOrder();
    }

    public void insertOrder(Order order){
        order.setCreate_time(new Date().getTime());
        order.setCreator("1");

        User userById = orderMapper.findUserById(order.getCreator());

        if(userById.getDeleted() == 0 && userById.getStatus() == 1){
            orderMapper.insertOrder(order);
        }
        else {
            throw new Error("Check your user id.");
        }

    }

    public void updateOrder(Order order){
        orderMapper.updateOrder(order);
    }

    public void deleteOrderById(String id){
        orderMapper.deleteOrderById(id);
    }

    public void updateStatus(Order order){
        int oldStatus = orderMapper.findStatusById(order.getId());
        System.out.println("Status"+oldStatus);

        if(oldStatus == 1) {
            orderMapper.updateStatus(order);
        }
        else {
            throw new Error("Order status must be unpaid.");
        }
    }
}
