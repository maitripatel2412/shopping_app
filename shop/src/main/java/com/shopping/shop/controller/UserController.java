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

import com.shopping.shop.entity.User;
import com.shopping.shop.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/create")
	public User createUser(@RequestBody User user) {  
		return userService.createUser(user);
	} 
	
	@GetMapping("/all")
	public List<User> findAll(){
		return userService.findAll();
	}
	
	@GetMapping("/{id}")
	public User findById(@PathVariable long id) {
		return userService.findById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable long id) {
		userService.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public User updateById(@RequestBody User user,@PathVariable long id) {
		return userService.updateById(user,id); 
	}
}
