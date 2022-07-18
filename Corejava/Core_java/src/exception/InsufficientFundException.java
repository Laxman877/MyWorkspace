package exception;

public class InsufficientFundException extends RuntimeException {
	double amt;
	InsufficientFundException(double need){
		amt = need;
		
	}
	public void display() {
		System.out.println("you need more : "+amt);
	}
}
