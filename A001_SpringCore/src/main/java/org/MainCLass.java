package org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCLass {
	public static void main(String[] args) {
		ApplicationContext contex=new ClassPathXmlApplicationContext("ApplicationContex2.xml");
		Question q=contex.getBean("q",Question.class);
		q.display();
	}
}
