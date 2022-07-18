package dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Employee;

public class Empdao {
	SessionFactory sf;
	public Empdao() {
		sf=new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).buildSessionFactory();
	}
	public void addemp(Employee emp) {
		Session sx=sf.openSession();
		Transaction tx=sx.beginTransaction();
		sx.saveOrUpdate(emp);
		tx.commit();
		sx.close();
	}
	public ArrayList<Employee> getAllEmp() {
		Session sx=sf.openSession();
		Transaction tx=sx.beginTransaction();
		return (ArrayList<Employee>) sx.createQuery("from Employee").list();
	}
	public void deleteEmp(int uid) {
		Session sx=sf.openSession();
		Transaction tx=sx.beginTransaction();
		Employee emp=sx.get(Employee.class, uid);
		sx.delete(emp);
		tx.commit();
		sx.close();
		
	}
	public  Employee getById(int uid) {
		Session sx=sf.openSession();
		Transaction tx=sx.beginTransaction();
		Employee emp=sx.get(Employee.class, uid);
		return emp;
		
	}
}
