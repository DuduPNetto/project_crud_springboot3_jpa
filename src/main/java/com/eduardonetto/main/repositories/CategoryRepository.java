package com.eduardonetto.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardonetto.main.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
