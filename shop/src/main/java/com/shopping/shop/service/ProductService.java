package com.shopping.shop.service;

import java.util.List;

import com.shopping.shop.entity.Product;

public interface ProductService {

	Product createProduct(Product product);

	List<Product> getAll();

	Product findById(long id);

	Product updateById(long id, Product product);

	void deleteById(long id);

}
