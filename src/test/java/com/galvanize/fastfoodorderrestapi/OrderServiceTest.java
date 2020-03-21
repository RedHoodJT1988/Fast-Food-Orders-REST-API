package com.galvanize.fastfoodorderrestapi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
public class OrderServiceTest {
    @Autowired
    OrderRepository orderRepository;

    OrderService orderService;

    @BeforeEach
    void setup() {
        orderService = new OrderService(orderRepository);
    }

    @Test
    void getAllOrders_whenEmpty_returnsOne() {
        // Setup
        Order order = new Order("Jane Doe", "2020-03-21", "PENDING", "Soft Taco, Bean Burrito, Large Pepsi", "2020-03-21" );
        System.out.println(order);
        orderRepository.save(order);
        int expected = 1;
        // Exercise
        int actual = orderService.getAllOrders().size();

        // Assert
        assertEquals(expected, actual);
        // Teardown
    }

}
