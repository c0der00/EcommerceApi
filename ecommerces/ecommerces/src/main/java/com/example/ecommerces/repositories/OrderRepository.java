package com.example.ecommerces.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerces.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
