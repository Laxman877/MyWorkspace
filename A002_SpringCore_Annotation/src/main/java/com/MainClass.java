package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext contex=new AnnotationConfigApplicationContext(AppConfig.class);
		
		BankAccount account1=contex.getBean("savingAccount",BankAccount.class);
		account1.getBalance();
		
//		BankAccount account2=contex.getBean("currentAccount",BankAccount.class);
//		account2.getBalance();
//		
//		BankAccount account3=contex.getBean("loan",BankAccount.class);
//		account3.getBalance();
//		
		
	}
}
