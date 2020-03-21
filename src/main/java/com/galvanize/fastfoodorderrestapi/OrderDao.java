package com.galvanize.fastfoodorderrestapi;
import com.galvanize.fastfoodorderrestapi.OrderService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends JpaRepository<OrderService,Long> {


}
