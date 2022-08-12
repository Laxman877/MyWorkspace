package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Product;
@Transactional
@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addOrUpdateProduct(Product prod) {
		// TODO Auto-generated method stub
		Session s=sessionFactory.getCurrentSession();
		s.saveOrUpdate(prod);
	}

	@Override
	public List<Product> getallProduct() {
		Session s=sessionFactory.getCurrentSession();
		return s.createQuery("from Product").list();
	}

	@Override
	public Product getProductById(int id) {
		Session s=sessionFactory.getCurrentSession();
		return s.get(Product.class, id);
	}

	@Override
	public void deleteProduct(int id) {
		Session s=sessionFactory.getCurrentSession();
		Product p=s.get(Product.class, id);
		s.delete(p);
	}

}
