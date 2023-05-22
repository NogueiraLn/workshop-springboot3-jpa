package com.projectudemy.courseudemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectudemy.courseudemy.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{


}
