package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepo userRepo;
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userRepo.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return (List<User>) userRepo.findAll();
	}

	@Override
	public User getUserById(int id) {
		User uid=null;
		List<User> u=(List<User>) userRepo.findAll();
		for(int i=0;i<u.size();i++) {
			User tempuser=u.get(i);
			if(tempuser.getId()==id) {
				uid=u.get(i);
			}
		}
		return uid;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);
	}

	@Override
	public User updateUser(User user, int id) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

}
