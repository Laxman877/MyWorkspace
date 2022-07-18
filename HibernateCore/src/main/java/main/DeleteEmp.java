package main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Employee;

public class DeleteEmp {
	public static void main(String[] args) {
		Session sf =new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory().openSession();
		Transaction tx=sf.beginTransaction();
		Employee emp=sf.get(Employee.class, 1);
		sf.delete(emp);
		tx.commit();
		sf.close();
	}
}
