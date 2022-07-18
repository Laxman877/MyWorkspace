package exception;
/*I2. W.A.J.P to create the validate method that takes integer value as a parameter. If the age is less than
18, then throw an ArithmeticException otherwise print a message welcome to vote. */
import java.util.Scanner;

public class I2_AgeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		try {
			if(age<18)
				throw new ArithmeticException("not eligible for vote");
			else 
				System.out.println("welcome to vote");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
