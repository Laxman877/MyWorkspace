package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Candidate;
import model.Course;

public class AddData {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Candidate.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
//		Course cs=new Course();
//		cs.setCourseName("Java");
//		Candidate c1=new Candidate();
//		c1.setCandidateName("laxman");
//		c1.addCourse(cs);
//		Candidate c2=new Candidate();
//		c2.setCandidateName("kunal");
//		c2.addCourse(cs);
//
//		Candidate cs=new Candidate();
//		cs.setCandidateName("amit");
//		Course c1=new Course();
//		c1.setCourseName("php");
//		c1.addCandidate(cs);
//		Course c2=new Course();
//		c2.setCourseName("android");
//		c2.addCandidate(cs);
//		s.save(c1);
//		s.save(c2);
//		s.save(cs);
//		Course cs=s.load(Course.class, 1);
//		Candidate c1=new Candidate();
//		c1.setCandidateName("krushit");
//		c1.addCourse(cs);
//		s.save(c1);
//		Candidate cs=s.load(Candidate.class, 1);
//		Course c1=new Course();
//		c1.setCourseName("python");
//		c1.addCandidate(cs);
//		s.save(c1);
		Course cs=s.load(Course.class, 2);
		Candidate c1=s.load(Candidate.class, 2);
		c1.addCourse(cs);
		s.save(c1);
		tx.commit();
	}
}
