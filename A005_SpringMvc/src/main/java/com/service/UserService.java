package com.service;

import java.util.ArrayList;

import com.model.User;

public interface UserService {
	
	public void addOrUpdateUser(User u);
	public ArrayList<User> getAllUser();
	public User getById(int id);
	public void deleteUser(int id);
}
