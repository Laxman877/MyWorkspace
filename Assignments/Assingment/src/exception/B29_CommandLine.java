package exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*B29. W.A.J. P to demonstrate try catch block, take two numbers from the user by Command line
argument and perform the division operation and handle Arithmetic */
public class B29_CommandLine {
	public static void main(String[] args) throws Exception{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		System.out.println("Enter two number for division...");
		int r;
		try
		{
			int a=Integer.parseInt(in.readLine());
			int b=Integer.parseInt(in.readLine());
			try
			{	
				r = a/b;
				System.out.println("Result is: "+r);
			}
			catch(ArithmeticException e)
			{
				System.out.println("division is not possible...");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array out of bound...");
		}
		finally
		{
			System.out.println("Program close...");
		}
	}
}
