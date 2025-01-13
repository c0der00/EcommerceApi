package com.example.ecommerces.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerces.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
