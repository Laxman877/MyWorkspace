package exception;
/*B27. W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero exception
and another one is to handle ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]
=30/0; */
public class B27_MulCatch {
	public static void main(String[] args) {
		try {
			int a[]= new int[5];
			a[5]=30/0;
			System.out.println(a[5]);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
