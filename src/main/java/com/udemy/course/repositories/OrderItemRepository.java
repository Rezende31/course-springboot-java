package com.udemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
