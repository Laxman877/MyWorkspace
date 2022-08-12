package com.service;

import java.util.List;

import com.model.Category;
import com.model.UserProfile;

public interface CategoryService {
	public void addOrUpdateCat(Category cat);
	public List<Category> getallCat();
	public Category getById(int id);
	public void deleteCat(int id);
}
