package com.shopping.shop.service;

import java.util.List;

import com.shopping.shop.entity.Category;

public interface CategoryService {

	Category createCategory(Category category);

	List<Category> findAll();

	Category findById(long id);

	void deleteById(long id);

	Category updateById(Category category, long id);

}
