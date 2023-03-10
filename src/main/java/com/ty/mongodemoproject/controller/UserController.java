package com.ty.mongodemoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.mongodemoproject.dto.User;
import com.ty.mongodemoproject.repository.userrepo.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserRepository repository;
	
	@PostMapping(value = "/save")
	public User saveUser(@RequestBody User user) {
		return repository.save(user);
	}
	
	@GetMapping(value = "/getall")
	public List<User> getAllUsers() {
		return repository.findAll();
		
	}
	
	@GetMapping(value = "/getbyid/{id}")
	public User getById(@PathVariable int id) {
		return repository.findById(id).get();
	}

	@DeleteMapping("/delete/{id}")
	public User deleteUser(@PathVariable int id) {
		User user=repository.findById(id).get();
		repository.delete(user);
		return user;
	}
	
	@GetMapping(value = "/getbyname")
	public User getByName(@RequestParam String name) {
		User user=repository.findByName(name);
		return user;
	}
	
	@GetMapping(value = "/getbyemailandname")
	public User getByNameAndEmail(@RequestParam String email,@RequestParam String name) {
		User user=repository.findByEmAndName(email, name);
		return user;
	}
}
