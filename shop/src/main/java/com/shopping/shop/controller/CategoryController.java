package com.shopping.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.shop.entity.Category;
import com.shopping.shop.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;

	@PostMapping("/save")
	public Category createCategory(@RequestBody Category category) {
		return categoryService.createCategory(category);
	}
	
	@GetMapping("/all")
	public List<Category> findAll(){
		return categoryService.findAll();
	}
	
	@GetMapping("/{id}")
	public Category findById(@PathVariable long id) {
		return categoryService.findById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable long id) {
		categoryService.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public Category updateById(@RequestBody Category category,@PathVariable long id) {
		return categoryService.updateById(category,id); 
	}
	
}
