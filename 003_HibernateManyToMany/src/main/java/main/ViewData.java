package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Candidate;
import model.Course;

public class ViewData {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Candidate.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
//		Course cs=s.load(Course.class, 2);
//		System.out.println(cs.getCourseId()+""+cs.getCourseName());
//		for(Candidate c:cs.getCandidates()) {
//			System.out.println(c.getCandidateId()+""+c.getCandidateName());
//		}
		List<Course> cs=s.createQuery("from Course").list();
		for(Course c:cs) {
			System.out.println(c.getCourseId()+""+c.getCourseName());
			for(Candidate c1:c.getCandidates()) {
				System.out.println(c1.getCandidateId()+""+c1.getCandidateName());
			}
		}
//		Candidate c1=s.load(Candidate.class, 1);
//		System.out.println(c1.getCandidateId()+" "+c1.getCandidateName());
//		for(Course c:c1.getCourses()) {
//			System.out.println(c.getCourseId()+" "+c.getCourseName());
//		}
	}
}
