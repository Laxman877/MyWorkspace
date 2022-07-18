package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;

public class ProductDao {
	SessionFactory sf=new Configuration()
			.configure("resources/hibernate.cfg.xml")
			.addAnnotatedClass(Category.class)
			.addAnnotatedClass(Product.class)
			.buildSessionFactory();
	
	
	public List<Category> viewAllCat() {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		return s.createQuery("from Category").list();
	}


	public void addProduct(Product p) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.save(p);
		tx.commit();
	}


	public List<Product> viewAllProduct() {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		return s.createQuery("from Product").list();
	}
	
}
