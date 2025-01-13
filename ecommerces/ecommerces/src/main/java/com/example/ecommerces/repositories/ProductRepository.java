package com.example.ecommerces.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerces.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
