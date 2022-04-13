package com.udemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
