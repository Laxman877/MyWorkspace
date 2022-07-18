package exception;

public class Bank {
	public static void main(String[] args) {
		BankOperation b = new BankOperation();
		b.getbalance();
		b.deposite(2000);
		b.getbalance();
		b.deposite(4000);
		b.getbalance();
		try {
			b.widrow(6000);
		}catch(InsufficientFundException e){
			e.printStackTrace();
			e.display();
		}
		b.getbalance();
	}

}
