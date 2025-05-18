package com.uShop.controller;

import com.uShop.model.Category;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
public class CaterogyController {

    private List<Category> categories = new ArrayList<>();

    @GetMapping("/api/v1/public/categories")
    public List<Category> getAllCategories() {
        return categories;
    }

    @PostMapping("/api/v1/public/categories")
    public String createCategory(@RequestBody Category category) {
        categories.add(category);
        return "✅ success";
    }

}
