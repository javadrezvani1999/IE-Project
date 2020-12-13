package com.example.demo.Controller;

import com.example.demo.Entity.Category;
import com.example.demo.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @RequestMapping("/getCategories")
    public List<Category> getCategories() {
        return categoryService.getCategories();
    }

    @RequestMapping("/newCategory")
    public Category newCategory(@RequestBody Category category) {
        return categoryService.registerCategory(category);
    }


}
