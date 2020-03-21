package com.galvanize.fastfoodorderrestapi;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;

    @Column
    String customerName;
    @Column
    String createdAt;
    @Column
    String status;
    @Column
    String description;
    @Column
    String lastUpdatedAt;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", createdAt=" + createdAt +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                ", lastUpdatedAt=" + lastUpdatedAt +
                '}';
    }

    public Order() {
    }

    public Order(String customerName, String createdAt, String status, String description, String lastUpdatedAt) {
        this.customerName = customerName;
        this.createdAt = createdAt;
        this.status = status;
        this.description = description;
        this.lastUpdatedAt = lastUpdatedAt;
    }

//    public Order(Long id, String customerName, String createdAt, String status, String description, String lastUpdatedAt) {
//        this.id = id;
//        this.customerName = customerName;
//        this.createdAt = createdAt;
//        this.status = status;
//        this.description = description;
//        this.lastUpdatedAt = lastUpdatedAt;
//    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(String lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }
}
