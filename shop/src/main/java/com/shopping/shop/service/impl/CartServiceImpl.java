package com.shopping.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.shop.entity.Cart;
import com.shopping.shop.repository.CartRepository;
import com.shopping.shop.service.CartService;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartRepository cartRepository;

	@Override
	public Cart createCart(Cart cart) {
		return cartRepository.save(cart);
	}

	@Override
	public List<Cart> findAll() {
		return cartRepository.findAll();
	}

	@Override
	public Cart findById(long id) {
		return cartRepository.findById(id).get();
	}

	@Override
	public Cart updateById(Cart cart, long id) {
		Cart oldCart = cartRepository.findById(id).get();
		cart.setId(id);
		return cartRepository.save(cart);
	}

	@Override
	public void deleteById(long id) {
		cartRepository.deleteById(id);
	}

	
	
}
