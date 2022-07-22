package main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDao;
import model.Student;

public class StudentCrud {
	public static void main(String[] args) {
		Student std=new Student();
		//std.setId(1);
		std.setUname("laxman");
		std.setEmail("laxman@gmail.com");
		std.setPass("laxman@45623");
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("applicationcontex.xml");
		StudentDao dao=contex.getBean("dao",StudentDao.class);
		//dao.addStudent(std);
		
		//dao.updateStudent(std);
		
		//dao.deleteStudent(1);
		
		List<Student> al=dao.viewAll();
		for(Student s:al) {
			System.out.println(s.getId()+" "+s.getUname()+" "+s.getEmail()+" "+s.getPass());
		}
	}
}
