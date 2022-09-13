package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
	
	public void addUser(User user);
	public List<User> getAllUser();
	public User getUserById(int id);
	public void deleteUser(int id);
	public User updateUser(User user,int id);
	
}
