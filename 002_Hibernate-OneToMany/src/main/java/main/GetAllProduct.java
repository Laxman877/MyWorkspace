package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;

public class GetAllProduct {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Product.class)
				.addAnnotatedClass(Category.class)
				.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		//all product
//		List<Category> cats=s.createQuery("from Category").list();
//		for(Category cat:cats) {
//			System.out.println(cat.getcId()+" "+cat.getcName());
//			for(Product p:cat.getProducts()) {
//				System.out.println(p.getpId()+" "+p.getpName()+" "+p.getPrice());
//			}
//		}
		//product by cat
//		Category c=s.load(Category.class, 3);
//		System.out.println(c.getcId()+" "+c.getcName());
//		for(Product p:c.getProducts()) {
//			System.out.println(p.getpId()+" "+p.getpName()+" "+p.getPrice());
//		}
		//get cat by prod
		Product p=s.load(Product.class, 8);
		System.out.println(p.getpId()+" "+p.getpName()+" "+p.getPrice()+" "+p.getCategory().getcName());
	}
}
