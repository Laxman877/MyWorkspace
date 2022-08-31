package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserProfileDao;
import com.model.UserProfile;
@Service
public class UserProfileServiceImpl implements UserProfileService {
	@Autowired
	UserProfileDao userProfileDao;
	
	@Override
	public void addOrUpdateUser(UserProfile u) {
		userProfileDao.addOrUpdateUser(u);
	}

	@Override
	public List<UserProfile> getallUser() {
		// TODO Auto-generated method stub
		return userProfileDao.getallUser();
	}

	@Override
	public UserProfile getById(int id) {
		// TODO Auto-generated method stub
		return userProfileDao.getById(id);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userProfileDao.deleteUser(id);
	}

	@Override
	public UserProfile loginCheck(UserProfile u) {
		// TODO Auto-generated method stub
		return userProfileDao.loginCheck(u);
	}

}
