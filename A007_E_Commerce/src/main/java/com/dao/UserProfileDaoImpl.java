package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.UserProfile;
@Transactional
@Repository
public class UserProfileDaoImpl implements UserProfileDao {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addOrUpdateUser(UserProfile u) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(u);
	}

	@Override
	public List<UserProfile> getallUser() {
		Session session=sessionFactory.getCurrentSession();
		return session.createQuery("from UserProfile").list();
	}

	@Override
	public UserProfile getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub

	}

}
