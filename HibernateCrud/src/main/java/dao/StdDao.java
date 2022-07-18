package dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;

public class StdDao {
	SessionFactory sf;
	public StdDao() {
		sf=new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
	}
	public void addStd(Student s) {
		Session sx=sf.openSession();
		Transaction tx=sx.beginTransaction();
		sx.saveOrUpdate(s);
		tx.commit();
		sx.close();
	}
	public ArrayList<Student> getAllStd() {
		Session sx=sf.openSession();
		Transaction tx=sx.beginTransaction();
		return (ArrayList<Student>) sx.createQuery("from Student").list();
	}
	public void deleteStd(int uid) {
		Session sx=sf.openSession();
		Transaction tx=sx.beginTransaction();
		Student std= sx.get(Student.class, uid);
		sx.delete(std);
		tx.commit();
		sx.close();
	}
	public Student getById(int uid) {
		Session sx=sf.openSession();
		Transaction tx=sx.beginTransaction();
		Student std=sx.get(Student.class, uid);
		return std;
	}
}
