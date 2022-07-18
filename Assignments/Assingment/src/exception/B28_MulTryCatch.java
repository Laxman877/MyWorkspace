package exception;
/*B28. W.A.J. P to implement the above program(pro.no-B27) using nesting of try-catch block. */
public class B28_MulTryCatch {
	public static void main(String[] args) {
		try {
			int i[]= new int[5];
			i[4]=30/0;
			System.out.println(i[4]);
			try {
				int a[]= new int[5];
				a[5]=30/3;
				System.out.println(a[4]);
			}catch(ArithmeticException e) {
				e.printStackTrace();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
