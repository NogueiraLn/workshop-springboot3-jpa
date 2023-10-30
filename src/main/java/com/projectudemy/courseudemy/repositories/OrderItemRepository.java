package com.projectudemy.courseudemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectudemy.courseudemy.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{


}
