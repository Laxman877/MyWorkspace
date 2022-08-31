package com.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Admin;
@Transactional
@Repository
public class AdmindaoImpl implements AdminDao {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public Admin validateUser(Admin admin) {
		Session session=sessionFactory.getCurrentSession();
		Admin ad= (Admin) session.createQuery("from Admin a where a.username='"+admin.getUsername()+"' and a.password='"+admin.getPassword()+"'").uniqueResult();
		return ad;
	}

}
