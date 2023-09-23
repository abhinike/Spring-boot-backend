package com.example.VeckorVorker.dao;

import com.example.VeckorVorker.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
