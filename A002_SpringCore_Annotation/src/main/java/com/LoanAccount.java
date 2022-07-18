package com;

import org.springframework.stereotype.Component;

@Component("loan")
public class LoanAccount implements BankAccount{

	public void getBalance() {
		System.out.println("This is loan account balance!!");
	}

}
