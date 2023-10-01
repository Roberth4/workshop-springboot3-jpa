package com.aprendendo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendo.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
