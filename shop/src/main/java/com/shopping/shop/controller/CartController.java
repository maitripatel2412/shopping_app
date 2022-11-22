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

import com.shopping.shop.entity.Cart;
import com.shopping.shop.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartService cartService;
	
	@PostMapping("/save")
	public Cart createCart(@RequestBody Cart cart) {
		return cartService.createCart(cart);
	}
	
	@GetMapping
	public List<Cart> findAll(){
		return cartService.findAll();
	}
	
	@GetMapping("/{id}")
	public Cart findById(@PathVariable long id) {
		return cartService.findById(id);
	}
	
	@PutMapping("/{id}")
	public Cart updatById(@RequestBody Cart cart,@PathVariable long id) {
		return cartService.updateById(cart,id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable long id) {
		cartService.deleteById(id);
	}
}
