package com.service;

import java.util.List;

import com.model.UserProfile;

public interface UserProfileService {
	
	public void addOrUpdateUser(UserProfile u);
	public List<UserProfile> getallUser();
	public UserProfile getById(int id);
	public void deleteUser(int id);
	public UserProfile loginCheck(UserProfile u);
}
