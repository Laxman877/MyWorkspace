package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;

public class AddProduct {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Product.class)
				.addAnnotatedClass(Category.class)
				.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Category ct=new Category();
		ct.setcName("electronics");
		
		Product p1=new Product();
		p1.setpName("ac");
		p1.setPrice(55000);
		p1.setCategory(ct);
		Product p2=new Product();
		p2.setpName("fan");
		p2.setPrice(1200);
		p2.setCategory(ct);
		s.save(ct);
		s.save(p1);
		s.save(p2);
		tx.commit();
		
	}
}
