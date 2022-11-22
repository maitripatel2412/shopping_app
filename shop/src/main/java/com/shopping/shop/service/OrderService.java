package com.shopping.shop.service;

import java.util.List;

import com.shopping.shop.entity.Orders;

public interface OrderService {

	Orders createOrder(Orders orders);

	List<Orders> getAll();

	Orders findById(long id);

	Orders updateById(long id, Orders orders);

	void deleteById(long id);

}
