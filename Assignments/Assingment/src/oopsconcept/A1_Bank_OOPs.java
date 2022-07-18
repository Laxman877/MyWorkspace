package oopsconcept;
/*A1. All the banks operating in India are controlled by RBI. RBI has set a well-defined guideline (e.g.
minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) which all banks
must follow. For example, suppose RBI has set minimum interest rate applicable to a saving bank
account to be 4% annually; however, banks are free to use 4% interest rate or to set any rates above it.
Write a JAVA program to implement bank functionality in the above scenario and demonstrate the
dynamic polymorphism concept. Note: Create few classes namely Customer, Account, RBI (Base Class)
and few derived classes (SBI, ICICI, PNB etc). Assume and implement required member variables and
functions in each class*/
class Customer{
	String name, address;
	int age;
	public Customer(String name,String address,int age) {
		this.name=name;
		this.address=address;
		this.age=age;
	}
	public void display() {
		System.out.println(name+" "+address+" "+age);
	}
}
class Account{
	String accountType;
	int accountnumber;
	double balance;
	public Account(String accountType,int accountnumber,double balance) {
		this.accountType=accountType;
		this.accountnumber=accountnumber;
		this.balance=balance;
	}
	public void display() {
		System.out.println(accountType+" "+accountnumber+" "+balance);
	}
}
class RBI{
	
	double getInterestRate() {
		return 4;
	}
	double getBalance() {
		return 0;
	}
	double getWidrowalLimit() {
		return 20000;
	}
}
class SBI extends RBI{
	double getInterestRate() {
		return 4.5;
	}
	double getWidrowalLimit() {
		return 10000;
	}
}
class ICICI extends RBI{
	double getInterestRate() {
		return 5;
	}
	double getWidrowalLimit() {
		return 25000;
	}
}
class PNB extends RBI{
	double getInterestRate() {
		return 5.5;
	}
	double getWidrowalLimit() {
		return 15000;
	}
}
public class A1_Bank_OOPs {
	public static void main(String[] args) {
		Customer c = new Customer("tushar", "Dhule maharashtra", 26);
		Account a = new Account("Current account", 0231142250, 235410);
		c.display();
		a.display();
		RBI b1 = new SBI();
		RBI b2 = new ICICI();
		RBI b3 = new PNB();
		
		System.out.println("SBI interest Rate: "+b1.getInterestRate());
		System.out.println("ICICI interest Rate: "+b2.getInterestRate());
		System.out.println("PNB interest Rate: "+b3.getInterestRate());
		
		System.out.println("SBI interest Rate: "+b1.getWidrowalLimit());
		System.out.println("ICICI interest Rate: "+b2.getWidrowalLimit());
		System.out.println("PNB interest Rate: "+b3.getWidrowalLimit());
	}
}
