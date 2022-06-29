package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.model.Order_Detail;
import com.example.demo.service.OrderDetailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderDetailController {
    private final OrderDetailService orderDetailService;

    public OrderDetailController(OrderDetailService orderDetailService) {
        this.orderDetailService = orderDetailService;
    }

    @PostMapping("/insertDetail")
    public void insertOrderDetail(@RequestBody Order_Detail order){
        orderDetailService.insertDetail(order);
    }

    @PutMapping("/updateItem")
    public void updateItem(@RequestBody Order_Detail order_detail){
        orderDetailService.updateItem(order_detail);
    }
}
