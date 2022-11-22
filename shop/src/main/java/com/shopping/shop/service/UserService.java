package com.shopping.shop.service;

import java.util.List;

import com.shopping.shop.entity.User;

public interface UserService {

	User createUser(User user);

	List<User> findAll();

	User findById(long id);

	void deleteById(long id);

	User updateById(User user, long id);

}
