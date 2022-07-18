package basics;

public class Datatype {

	public static void main(String[] args) {
		int i='A';
		System.out.println(i);
		
		char c = 70;
		System.out.println(c);
		
		//widening
		//implicit
		int a= 20;
		long a1= a;
		
		//narrowing
		//explicit
		long b = 5892;
		int b1=(int) b;
		
	}
}
