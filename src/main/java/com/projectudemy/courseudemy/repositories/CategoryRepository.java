package com.projectudemy.courseudemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectudemy.courseudemy.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
