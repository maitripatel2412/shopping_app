package com.shopping.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.shop.entity.Product;
import com.shopping.shop.repository.ProductRepository;
import com.shopping.shop.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}

	@Override
	public Product findById(long id) {
		return productRepository.findById(id).get();
	}

	@Override
	public Product updateById(long id, Product product) {
		Product oldProduct = productRepository.findById(id).get();
		product.setId(id);
		return productRepository.save(product);
	}

	@Override
	public void deleteById(long id) {
		productRepository.deleteById(id);
	}

}
