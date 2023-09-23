package com.example.VeckorVorker.serviecs;

import com.example.VeckorVorker.dao.CategoryRepository;
import com.example.VeckorVorker.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategoryService {

    @Autowired
    CategoryRepository repository;

    public void addCategory(Category category){
        repository.save(category);
    }

    public List<Category> getAllCategory(){
        return repository.findAll();
    }


    public Optional<Category> getCategoryById(int categoryId)  {
        return repository.findById(categoryId);
    }

}
