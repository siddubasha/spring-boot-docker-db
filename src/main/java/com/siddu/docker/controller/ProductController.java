package com.siddu.docker.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siddu.docker.entity.Product;
import com.siddu.docker.repository.ProductRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ProductController {

	
	
	private ProductRepository productRepository;
	
	@GetMapping("/")
	public String hello() {
		return "Hello im Product Controller";
	}
	
	@GetMapping("/product")
	public List<Product> getProducts(){
		
		return productRepository.findAll();
	}
	
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	
}
