package com.shopping.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.shop.entity.Orders;
import com.shopping.shop.repository.OrderRepository;
import com.shopping.shop.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Orders createOrder(Orders orders) {
		return orderRepository.save(orders);
	}

	@Override
	public List<Orders> getAll() {
		return orderRepository.findAll();
	}

	@Override
	public Orders findById(long id) {
		return orderRepository.findById(id).get();			
	}

	@Override
	public Orders updateById(long id, Orders orders) {
		Orders oldOrder = orderRepository.findById(id).get();
		orders.setId(id);
		return orderRepository.save(orders);
	}

	@Override
	public void deleteById(long id) {
		orderRepository.deleteById(id);
	}

}
