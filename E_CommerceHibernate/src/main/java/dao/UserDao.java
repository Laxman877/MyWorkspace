package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Customer;

public class UserDao {
	SessionFactory sf=new Configuration()
			.configure("resources/hibernate.cfg.xml")
			.addAnnotatedClass(Customer.class)
			.buildSessionFactory();
	
	public void registerUser(Customer c) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.saveOrUpdate(c);
		tx.commit();
		s.clear();
	}
	public Customer isEmailExist(Customer c) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		String qry="from Customer c where c.email='"+c.getEmail()+"'";
		Customer cus =  (Customer) s.createQuery(qry).uniqueResult();
		return cus;
	}
	
	public Customer isMobileExist(Customer c) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		String qry="from Customer c where c.mobile='"+c.getMobile()+"'";
		Customer cus =  (Customer) s.createQuery(qry).uniqueResult();
		return cus;
	}
	public boolean loginCheck(Customer c) {
		boolean b = false;
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		String qry="from Customer c where c.email='"+c.getEmail()+"' and c.pass='"+c.getPass()+"'";
		Customer cus =  (Customer) s.createQuery(qry).uniqueResult();
		if(cus!=null)
		{
			b = true;
		}
		return b;
	}
}
