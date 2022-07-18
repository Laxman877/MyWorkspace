package dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Employee;
import model.EmployeeDetail;

public class EmpDao {
	SessionFactory sf;
	public EmpDao() {
		sf=new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(EmployeeDetail.class)
				.buildSessionFactory();
	}
	public void addEmp(Employee emp) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.saveOrUpdate(emp);
		tx.commit();
		s.close();
		
	}
	public ArrayList<Employee> getAllEmp() {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		return (ArrayList<Employee>) s.createQuery("from Employee").list();
	}
}
