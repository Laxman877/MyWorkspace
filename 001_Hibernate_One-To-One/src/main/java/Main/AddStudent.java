package Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;
import model.StudentDetails;

public class AddStudent {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration()
							.configure("resources/hibernate.cfg.xml")
							.addAnnotatedClass(Student.class)
							.addAnnotatedClass(StudentDetails.class)
							.buildSessionFactory();
		
		StudentDetails sd=new StudentDetails();
		sd.setFname("laxman");
		sd.setLname("patil");
		
		Student std=new Student();
		std.setEmail("laxman@gmail.com");
		std.setPass("laxman123");
		std.setStudentDetails(sd);
		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.save(std);
		s.save(sd);
		tx.commit();
	}
}
