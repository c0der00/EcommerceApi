package com.example.ecommerces.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerces.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
