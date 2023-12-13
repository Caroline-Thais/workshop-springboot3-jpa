package com.projetospring.projetospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.projetospring.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {	
}
