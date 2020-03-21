package com.galvanize.fastfoodorderrestapi;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

//@SpringBootTest
//@AutoConfigureMockMvc
//public class OrderTest {
//   @Mock
//    OrderRepository orderRepository;
//
//   @Test
//    void countOrders() {
//       String sql = "select count(*) from orders";
//       List<Order> orders = new ArrayList<Order>();
//       Long expected = 1L;
//
//       orders.add(new Order("Jane Doe", "2020-03-21", "PENDING", "Soft Taco, Bean Burrito, Large Pepsi", "2020-03-21"));
//
//       when(orderRepository.count()).thenReturn(expected);
//   }
//
//
//
//}



