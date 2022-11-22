package com.shopping.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.shop.entity.SubCategory;
import com.shopping.shop.repository.SubCategoryRepository;
import com.shopping.shop.service.SubCategoryService;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {

	@Autowired
	private SubCategoryRepository subCategoryRepository;

	@Override
	public SubCategory createCategory(SubCategory subCategory) {
		return subCategoryRepository.save(subCategory);
	}

	@Override
	public List<SubCategory> findAll() {
		return subCategoryRepository.findAll();
	}

	@Override
	public SubCategory findById(long id) {
		return subCategoryRepository.findById(id).get();
	}

	@Override
	public void deleteById(long id) {
		subCategoryRepository.deleteById(id);
	}

	@Override
	public SubCategory updateById(SubCategory subCategory, long id) {
		SubCategory oldSubCategory = subCategoryRepository.findById(id).get();
		subCategory.setId(id);
		return subCategoryRepository.save(subCategory);
	}
	
}
