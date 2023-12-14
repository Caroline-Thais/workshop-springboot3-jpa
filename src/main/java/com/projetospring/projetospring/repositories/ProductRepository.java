package com.projetospring.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.projetospring.entities.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {	
}
