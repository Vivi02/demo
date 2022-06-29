package com.example.demo.service;

import com.example.demo.mapper.OrderDetailMapper;
import com.example.demo.mapper.OrderMapper;
import com.example.demo.model.Order;
import com.example.demo.model.Order_Detail;
import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService {
    private final OrderDetailMapper orderDetailMapper;

    public OrderDetailService(OrderDetailMapper orderDetailMapper) {
        this.orderDetailMapper = orderDetailMapper;
    }

    public void insertDetail(Order_Detail order_detail){
        Product productById = orderDetailMapper.findProductById(order_detail.getItem_id());

        //System.out.println("Id "+productById+"");

        if(productById.getDeleted() == 0 && productById.getPrice().equals(order_detail.getPrice())
                && order_detail.getQuantity() > 0){
            orderDetailMapper.insertDetail(order_detail);
        }
        else {
            throw new Error("Check your product.");
        }
    }

    public void updateItem(Order_Detail order_detail){
        int orderStatus = orderDetailMapper.findStatusByOrderNo(order_detail.getOrder_no());

        if(orderStatus == 1 && order_detail.getQuantity() > 0){
            orderDetailMapper.updateItem(order_detail);
        }
        else {
            throw new Error("Please check your order again.");
        }
    }
}
