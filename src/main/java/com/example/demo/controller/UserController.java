package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
@RestController
@RequestMapping("users")
public class UserController {
	@Autowired
	UserRepository userrepository;
	@GetMapping("all")
	public List<User> getAllProducts()
	{
		List<User> user=(List<User>) userrepository.findAll();
		return user;
	}
	@PostMapping("add")
	public User addProduct(@RequestBody User product)
	{
		return userrepository.save(product);
	}
	@GetMapping("user/{id}")
	public Optional<User> getProductId(@PathVariable int id)
	{
		return userrepository.findById(id);
	}

}
