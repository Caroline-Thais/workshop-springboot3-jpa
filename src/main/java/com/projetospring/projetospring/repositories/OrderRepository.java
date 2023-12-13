package com.projetospring.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.projetospring.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {	
}
