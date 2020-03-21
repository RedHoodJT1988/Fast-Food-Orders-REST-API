package com.galvanize.fastfoodorderrestapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Optional;

@SpringBootTest
@AutoConfigureMockMvc
public class OrderControllerTest {


    @Autowired
    MockMvc mockMvc;


    @MockBean
    OrderService orderService;

    OrderDao orderDao;

    @Test
    void getAllOrders() throws Exception{
        int expected = 0;
        when(orderService.getAllOrders()).thenReturn(new ArrayList<>());

        mockMvc.perform(get("/api/orders").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(expected)));

    }

    @Test
    void createOrder() throws Exception{

        Order newOrder = new Order("Jacob Jones", "03-21-20", "PENDING", "A burrito,pepsi,","03-21-20");
        ObjectMapper objectMapper = new ObjectMapper();
        String newOrderJson = objectMapper.writeValueAsString(newOrder);

        when(orderService.createOrder(ArgumentMatchers.any(Order.class))).thenReturn(newOrder);

        //Excercise

        mockMvc.perform(post("/api/orders").content(newOrderJson).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.customerName").value(newOrder.getCustomerName()))
                .andExpect((jsonPath("$.createdAt").value(newOrder.getCreatedAt())))
                .andExpect((jsonPath("$.status").value(newOrder.getStatus())))
                .andExpect((jsonPath("$.description").value(newOrder.getDescription())))
                .andExpect((jsonPath("$.lastUpdatedAt").value(newOrder.getLastUpdatedAt())));

    }

      @Test
    void findOrderById() throws Exception{

          Order newOrder = new Order("Jacob Jones", "03-21-20", "PENDING", "A burrito,pepsi,","03-21-20");

          Long id = 1l;
          when(orderDao.findById(id));

          mockMvc.perform(get("/api/orders/1").accept(MediaType.APPLICATION_JSON))
                  .andExpect(status().isOk())

           .andExpect(jsonPath("$.id").value(newOrder.getId()));


      }

}
