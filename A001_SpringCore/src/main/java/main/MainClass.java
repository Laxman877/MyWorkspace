package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Student;

public class MainClass {
	public static void main(String[] args) {
//		Student std=new Student();
//		std.setId(10);
//		std.setName("laxman");
//		std.setEmail("laxman@gmail.com");
		ApplicationContext contex=new ClassPathXmlApplicationContext("ApplicationContex.xml");
		Student std=contex.getBean("std",Student.class);
		
		std.display();
	}
}
