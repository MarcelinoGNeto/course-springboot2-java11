package com.eumesmo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eumesmo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
