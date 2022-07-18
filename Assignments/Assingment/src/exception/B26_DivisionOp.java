package exception;
/*B26. W.A.J. P to demonstrate try catch block,
Take two numbers from the user and perform the division operation and handle Arithmetic Exception.*/
import java.util.Scanner;

public class B26_DivisionOp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two numbers for division");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			int c = a/b;
			System.out.println("Result: "+c);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
	}
}
