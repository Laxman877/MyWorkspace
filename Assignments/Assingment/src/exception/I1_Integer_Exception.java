package exception;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*I1. W.A.J.P to read 10 integer values using Scanner class from keyboard. Generate the exception if the
entered value is less than 10 and or greater than 40. Program should display appropriate message as
and when this exception occurs otherwise it will display all the entered values.*/
import java.util.Scanner;

public class I1_Integer_Exception {
	public static void main(String[] args) {
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		System.out.println("please enter the value");
		int a;
		try {
			for(int i=0;i<10;i++) {
			a = Integer.parseInt(in.readLine());
			if(a<10 || a>40) 
				throw(new Exception("valid range is 10 to 40"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
