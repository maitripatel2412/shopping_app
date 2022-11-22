package com.shopping.shop.service;

import java.util.List;

import com.shopping.shop.entity.Cart;

public interface CartService {

	Cart createCart(Cart cart);

	List<Cart> findAll();

	Cart findById(long id);

	Cart updateById(Cart cart, long id);

	void deleteById(long id);

}
