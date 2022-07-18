package onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Course;
import model.Instructor;
import model.Instructor_detail;

public class AddData {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Instructor_detail.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
//		Instructor_detail detail=s.load(Instructor_detail.class, 2);
//		
//		Instructor ins=s.load(Instructor.class, 2);
//		ins.setInstructor_detail(detail);
//		
		Instructor ins=s.load(Instructor.class, 1);
		
		Course c1=new Course();
		c1.setCname("core java");
		
		Course c2=new Course();
		c2.setCname("advance java");
		
		ins.addCourse(c1);
		ins.addCourse(c2);
		
		s.save(c1);
		s.save(c2);
		tx.commit();
	}
}
