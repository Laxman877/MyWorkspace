package com.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;
@Transactional
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addOrUpdateUser(User u) {
		Session s=sessionFactory.getCurrentSession();
		s.saveOrUpdate(u);
	}

	@Override
	public ArrayList<User> getAllUser() {
		Session s=sessionFactory.getCurrentSession();
		return (ArrayList<User>) s.createQuery("from User").list();
	}

	@Override
	public User getById(int id) {
		Session s=sessionFactory.getCurrentSession();
		User u= s.load(User.class, id);
		System.out.println(u.getId()+" "+u.getEmail());
		return u;
	}

	@Override
	public void deleteUser(int id) {
		Session s=sessionFactory.getCurrentSession();
		User u=s.load(User.class, id);
		s.delete(u);
	}

}
