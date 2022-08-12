package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CategoryDao;
import com.model.Category;
@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryDao adminCatAddDao;

	@Override
	public void addOrUpdateCat(Category cat) {
		// TODO Auto-generated method stub
		adminCatAddDao.addOrUpdateCat(cat);
	}

	@Override
	public List<Category> getallCat() {
		// TODO Auto-generated method stub
		return adminCatAddDao.getallCat();
	}

	@Override
	public Category getById(int id) {
		// TODO Auto-generated method stub
		return adminCatAddDao.getById(id);
	}

	@Override
	public void deleteCat(int id) {
		// TODO Auto-generated method stub
		adminCatAddDao.deleteCat(id);
	}

}
