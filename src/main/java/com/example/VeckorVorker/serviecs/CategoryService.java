package com.example.VeckorVorker.serviecs;

import com.example.VeckorVorker.dao.CategoryRepository;
import com.example.VeckorVorker.model.Category;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryService {

    @Autowired
    CategoryRepository repository;

    public void addCategory(Category category){
        repository.save(category);
    }

    public List<Category> getAllCategory(){
        return repository.findAll();
    }


    public Category getCategoryById(int categoryId) throws Exception {
        return repository.findById(categoryId)
                .orElseThrow(() -> new Exception("Category not found with ID: " + categoryId));
    }

}
