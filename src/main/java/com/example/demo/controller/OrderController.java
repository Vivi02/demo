package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/findAllOrder")
    public List<Order> findAllOrder(){
        return orderService.findAllOrder();
    }

    @PostMapping("/insertOrder")
    public void insertOrder(@RequestBody Order order){
        orderService.insertOrder(order);
    }

    @PutMapping("/updateOrder")
    public void updateOrder(@RequestBody Order order){
        orderService.updateOrder(order);
    }

    @PutMapping("/updateStatus")
    public void updateStatus(@RequestBody Order order){
        orderService.updateStatus(order);
    }


    @DeleteMapping("/deleteOrderById/{id}")
    public void deleteOrderById(@PathVariable String id){
        orderService.deleteOrderById(id);
    }

}
