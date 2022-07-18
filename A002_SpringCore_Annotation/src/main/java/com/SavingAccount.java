package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SavingAccount implements BankAccount{
	@Autowired
	@Qualifier("basicInfo")
	CustomerDetails customerDetails;
	public void getBalance() {
		System.out.println("This is Saving account balance!!");
		customerDetails.getBasicDeatils();
	}
	
}
