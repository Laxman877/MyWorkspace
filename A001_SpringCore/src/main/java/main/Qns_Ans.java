package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Question;

public class Qns_Ans {
	public static void main(String[] args) {
		ApplicationContext contex=new ClassPathXmlApplicationContext("ApplicationContex.xml");
		Question q=contex.getBean("que",Question.class);
		q.display();
	}
}
