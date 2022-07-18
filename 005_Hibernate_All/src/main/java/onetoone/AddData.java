package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Instructor;
import model.Instructor_detail;

public class AddData {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration()
				.configure("resources/hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Instructor_detail.class)
				.buildSessionFactory();
		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Instructor_detail detail=new Instructor_detail();
		detail.setInsd_channel("Learn_Java");
		
		Instructor ins=new Instructor();
		ins.setIns_name("laxman");
		ins.setInstructor_detail(detail);
		
		s.save(ins);
		tx.commit();
	}
}
