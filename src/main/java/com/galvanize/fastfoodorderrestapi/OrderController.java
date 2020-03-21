package com.galvanize.fastfoodorderrestapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/orders")
public class OrderController {

    OrderService orderService;
    OrderDao orderDao;

    @Autowired
    public OrderController(OrderService orderService ){
        this.orderService = orderService;

    }


    @PostMapping
    ResponseEntity<Order> createOrder(Order order){
        return ResponseEntity.ok(orderService.createOrder(order));
    }


     @GetMapping
    ResponseEntity<List<Order>> getAllOrders(){
        return ResponseEntity.ok(orderService.getAllOrders());

     }


     @GetMapping("/api/orders/{id}")
    Optional<OrderService> one(@PathVariable Long id){
        return orderDao.findById(id);

     }


}
