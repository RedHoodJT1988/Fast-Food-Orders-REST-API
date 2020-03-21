package com.galvanize.fastfoodorderrestapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService  {

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
