package exception;

public class CompileTimeDemo {
	public static void main(String[] args) {
		try {
			Class.forName("execption.FirstException");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String str = "123ll";
		int i = Integer.parseInt(str);
		
		System.out.println(i);
	}
}
