package com.example.VeckorVorker.api;


import com.example.VeckorVorker.model.Category;
import com.example.VeckorVorker.serviecs.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/category")
public class CategoryController {

    @Autowired
    CategoryService service ;

    CategoryController(CategoryService service){
        this.service = service;
    }

    @GetMapping
    List<Category> getAllCategory(){
        return service.getAllCategory();
    }

    @PostMapping
    void postCategory(@RequestBody Category category){
         service.addCategory(category);
    }

    @GetMapping
    @RequestMapping(path = "{id}")
    Optional<Category> getCategoryById( @PathVariable(name = "id")  int id){

            return  service.getCategoryById(id);

    }


    
}
