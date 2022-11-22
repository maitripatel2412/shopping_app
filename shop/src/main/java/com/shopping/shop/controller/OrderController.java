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

import com.shopping.shop.entity.Orders;
import com.shopping.shop.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/save")
	public Orders createOrder(@RequestBody Orders orders) {
		return orderService.createOrder(orders);
	}
	
	@GetMapping
	public List<Orders> getAll(){
		return orderService.getAll();
	}
	
	@GetMapping("/{id}")
	public Orders findById(@PathVariable long id) {
		return orderService.findById(id);
	}
	
	@PutMapping("/{id}")
	public Orders updateById(@PathVariable long id,@RequestBody Orders orders) {
		return orderService.updateById(id,orders);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable long id) {
		orderService.deleteById(id);
	}

}
