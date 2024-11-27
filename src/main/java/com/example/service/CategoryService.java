package com.example.service;

import com.example.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CategoryService {
    Page<Category> getAllCategories(Pageable pageable);
    Category saveCategory(Category category);
    Optional<Category> getCategoryById(Long id);
    void deleteCategoryById(Long id);
}
