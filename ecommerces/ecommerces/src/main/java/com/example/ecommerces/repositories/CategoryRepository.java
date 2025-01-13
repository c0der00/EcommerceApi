package com.example.ecommerces.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerces.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
