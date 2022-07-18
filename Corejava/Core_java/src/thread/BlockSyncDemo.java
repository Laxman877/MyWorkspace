package thread;

import java.util.Scanner;

class Account  {
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	public boolean isAvailable(double amt) {
		boolean b = false;
		if(amt>balance) {
			b= false;
		}
		else {
			b= true;
		}
		return b;
	}
	public void widrow(double amt) {
		balance = balance - amt;
		System.out.println("Amount is debited ..cuurent balance is : "+balance);
	}
}
class Customer implements Runnable {
	String name;
	Account account;
	public Customer(String name, Account account) {
		super();
		this.name = name;
		this.account = account;
	}

	@Override
	public void run() {
		synchronized (account) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to widrow: "+name);
		double amount = sc.nextDouble();
		if(account.isAvailable(amount)) {
			account.widrow(amount);
		}
		else {
			System.out.println("Insufficient balance...");
		}
		}
	}
}
public class BlockSyncDemo {
	public static void main(String[] args) {
		Account ac = new Account(12000);
		Customer c1 = new Customer("kunal",ac);
		Customer c2 = new Customer("akshay",ac);
		
		Thread th1 = new Thread(c1);
		Thread th2 = new Thread(c2);
		
		th1.start();
		th2.start();
	}

}
