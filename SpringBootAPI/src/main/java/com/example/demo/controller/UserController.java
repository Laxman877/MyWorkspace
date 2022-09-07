package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	@RequestMapping("/")
	public String home() {
		return "Hello";
	}
	@GetMapping("users")
	public List<User> getUser() {
		return new UserService().getAllUser();
	}
	@PostMapping("users")
	public List<User> addUser(@RequestBody User user) {
		return new UserService().addUser(user);
	}
//	@PutMapping("users")
//	public String updateUser() {
//		return "update calling";
//	}
	@PutMapping("/users/{id}")
	public List<User> updateUser(@RequestBody User user,@PathVariable("id") int id) {
		return new UserService().updateUser(id,user);
	}
//	@DeleteMapping("users")
//	public String deleteUser() {
//		return "delete calling..";
//	}
	@DeleteMapping("/users/{id}")
	public List<User> deleteUser(@PathVariable("id") int id) {
		return new UserService().deleteUser(id);
	}
}
