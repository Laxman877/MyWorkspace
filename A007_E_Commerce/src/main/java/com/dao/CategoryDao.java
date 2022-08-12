package com.dao;

import java.util.List;

import com.model.Category;

public interface CategoryDao {
	public void addOrUpdateCat(Category cat);
	public List<Category> getallCat();
	public Category getById(int id);
	public void deleteCat(int id);
}
