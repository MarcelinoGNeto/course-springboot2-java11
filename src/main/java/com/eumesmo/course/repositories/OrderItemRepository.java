package com.eumesmo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eumesmo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
