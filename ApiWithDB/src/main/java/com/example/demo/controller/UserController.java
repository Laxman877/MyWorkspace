package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String home() {
		return "User Api Home";
	}
	@PostMapping("/users")
	public String addUser(@RequestBody User user) {
		userService.addUser(user);
		return "Data added!!";
	}
	@GetMapping("/users")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable("id") int id) {
		return userService.getUserById(id);
	}
	@PutMapping("/users/{id}")
	public String updateUser(@RequestBody User user, @PathVariable("id")int id) {
		userService.updateUser(user, id);
		return "Data Updated!!";
	}
	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable("id")int id) {
		userService.deleteUser(id);
		return "Data Deleted!!";
	}
}
