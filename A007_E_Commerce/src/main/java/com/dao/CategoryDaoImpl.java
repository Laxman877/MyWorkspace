package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Category;
@Transactional
@Repository
public class CategoryDaoImpl implements CategoryDao {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addOrUpdateCat(Category cat) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(cat);
	}

	@Override
	public List<Category> getallCat() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		return session.createQuery("from Category").list();
	}

	@Override
	public Category getById(int id) {
		Session session=sessionFactory.getCurrentSession();
		return session.get(Category.class, id);
	}

	@Override
	public void deleteCat(int id) {
		Session session=sessionFactory.getCurrentSession();
		Category cat= session.get(Category.class, id);
		session.delete(cat);
	}

}
