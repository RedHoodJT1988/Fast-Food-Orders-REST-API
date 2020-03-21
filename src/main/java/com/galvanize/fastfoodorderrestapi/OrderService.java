package com.galvanize.fastfoodorderrestapi;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    OrderRepository orderRepository;

    public OrderService(OrderRepository repository) {
        this.orderRepository = repository;
    }

    List<Order> getAllOrders() {
        return this.orderRepository.findAll();
    }

    Order createOrder(Order order) {
        return orderRepository.save(order);
    }

}
