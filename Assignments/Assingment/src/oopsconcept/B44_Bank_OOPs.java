package oopsconcept;
/*B44. Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are
deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank',
each having a method named 'getBalance'. Call this method by creating an object of each of the three
classes. */
abstract class Bank{
	abstract double getBalance();
}
class BankA extends Bank{
	double balance;
	void deposite(double money) {
		balance+=money;
	}
	double getBalance() {
		return balance;
	}
}
class BankB extends Bank{
	double balance;
	void deposite(double money) {
		balance+=money;
	}
	double getBalance() {
		return balance;
	}
}
class BankC extends Bank{
	double balance;
	void deposite(double money) {
		balance+=money;
	}
	double getBalance() {
		return balance;
	}
}
public class B44_Bank_OOPs {
	public static void main(String[] args) {
		BankA kA = new BankA();
		BankB kB = new BankB();
		BankC kC = new BankC();
		kA.deposite(100);
		kB.deposite(150);
		kC.deposite(200);
		System.out.println("Balance of BankA=$"+kA.getBalance());
		System.out.println("Balance of BankB=$"+kB.getBalance());
		System.out.println("Balance of BankC=$"+kC.getBalance());
	}

}
