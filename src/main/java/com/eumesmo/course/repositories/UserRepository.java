package com.eumesmo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eumesmo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
