package com.shopping.shop.service;

import java.util.List;

import com.shopping.shop.entity.SubCategory;

public interface SubCategoryService {

	SubCategory createCategory(SubCategory subCategory);

	List<SubCategory> findAll();

	SubCategory findById(long id);

	void deleteById(long id);

	SubCategory updateById(SubCategory subCategory, long id);

}
