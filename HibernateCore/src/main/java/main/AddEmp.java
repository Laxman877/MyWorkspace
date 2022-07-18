package main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Employee;

public class AddEmp {
	public static void main(String[] args) {
		Session sf;
		Employee emp=new Employee();
		emp.setId(3);
		emp.setName("kishor");
		emp.setEmail("kishor@gmail.com");
		emp.setDept("account");
		
		sf =new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory().openSession();
		Transaction tx=sf.beginTransaction();
		sf.saveOrUpdate(emp);
		tx.commit();
		sf.close();
	}
}
