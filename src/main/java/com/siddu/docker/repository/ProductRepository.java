package com.siddu.docker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siddu.docker.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
