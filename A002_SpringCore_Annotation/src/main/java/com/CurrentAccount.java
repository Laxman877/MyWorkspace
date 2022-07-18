package com;

import org.springframework.stereotype.Component;

@Component
public class CurrentAccount implements BankAccount {

	public void getBalance() {
		System.out.println("This is current account balance!!");
	}

}
