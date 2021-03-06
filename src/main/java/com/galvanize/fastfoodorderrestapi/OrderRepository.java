package com.galvanize.fastfoodorderrestapi;

import com.galvanize.fastfoodorderrestapi.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
