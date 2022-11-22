package com.shopping.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.shop.entity.Category;
import com.shopping.shop.repository.CategoryRepository;
import com.shopping.shop.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Category findById(long id) {
		return categoryRepository.findById(id).get();
	}

	@Override
	public void deleteById(long id) {
		categoryRepository.deleteById(id);
	}

	@Override
	public Category updateById(Category category, long id) {
		Category oldcategory = categoryRepository.findById(id).get();
		category.setId(id);
		return categoryRepository.save(category);
	}
	
}
