package exception;
/*A1. W.A.J.Pto create a custom exception if Customer withdraw amount which is greater than account
balance then program will show custom exception otherwise amount will deduct from account
balance. */
class InsufficientFundException extends RuntimeException{
	double amt;
	public InsufficientFundException(double need) {
		// TODO Auto-generated constructor stub
		amt = need;
	}
	public void display() {
		System.out.println("sorry in sufficient balance you need more: "+amt+" to perform this operation");
	}
}
class BankOperation{
	double balance;
	public void getBalance() {
		System.out.println("current balance is: "+balance);
	}
	public void deposite(double amt) {
		balance = balance+amt;
		System.out.println(amt+"credited");
	}
	public void widrow(double amt)throws InsufficientFundException{
		if(amt>balance) {
			double need = amt-balance;
			throw new InsufficientFundException(need);
		}else {
			balance = balance -amt;
			System.out.println(amt+"debited");
		}
	}
}
public class A1_Widrawal {
	public static void main(String[] args) {
		BankOperation b = new BankOperation();
		b.getBalance();
		b.deposite(2000);
		try {
			b.widrow(2500);
		}catch(InsufficientFundException e) {
			e.printStackTrace();
			e.display();
		}
	}
}
