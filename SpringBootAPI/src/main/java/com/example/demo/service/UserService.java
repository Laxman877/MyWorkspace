package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.User;

public class UserService {
	
	List<User> users=new ArrayList<>();
	
	public UserService() {
		users.add(new User(10, "laxman", "laxman@gmail.com"));
		users.add(new User(20, "krushit","krushit@gmail.com"));
	}
	
	public List<User> getAllUser(){
		return users;
	}
	
	public List<User> addUser(User user) {
		users.add(user);
		return users;
	}

	public List<User> deleteUser(int id) {
		for(int i=0;i<users.size();i++) {
			User tempUser=users.get(i);
			if(tempUser.getId()==id) {
				users.remove(i);
			}
		}
		return users;
	}

	public List<User> updateUser(int id, User user) {
		for(int i=0;i<users.size();i++) {
			User tempUser=users.get(i);
			if(tempUser.getId()==id) {
				users.set(i, user);
			}
		}
		return users;
	}
}
