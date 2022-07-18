package exception;

public class BankOperation {
	double balance;
	public void getbalance() {
		System.out.println("current balance is: "+balance);
	}
	public void deposite(double amt) {
		balance=balance+amt;
		System.out.println(amt+" credited!!");
	}
	public void widrow(double amt) throws InsufficientFundException {
		if(amt>balance) {
//			System.out.println("insufficient fund!!");
			double need = amt - balance;
			throw new InsufficientFundException(need);
		}
		else {
			balance = balance-amt;
			System.out.println(amt+" debited");
		}
	}
}
