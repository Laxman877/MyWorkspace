package com.dao;

import java.util.List;

import com.model.UserProfile;

public interface UserProfileDao {
	
	public void addOrUpdateUser(UserProfile u);
	public List<UserProfile> getallUser();
	public UserProfile getById(int id);
	public void deleteUser(int id);
	public UserProfile loginCheck(UserProfile u);
}
