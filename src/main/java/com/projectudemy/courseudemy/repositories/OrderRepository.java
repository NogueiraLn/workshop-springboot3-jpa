package com.projectudemy.courseudemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectudemy.courseudemy.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{


}
