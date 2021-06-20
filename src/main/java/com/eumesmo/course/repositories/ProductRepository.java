package com.eumesmo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eumesmo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
