package oopsconcept;
/*B35. Create a class named 'PrintNumber' to print various numbers of different datatypes by creating
different methods with the same name 'printn' having a parameter for each data type.*/
public class PrintNumber {
	public int printn(int a) {
		System.out.println(a);
		return a;
	}
	public float printn(float f) {
		System.out.println(f);
		return f;
	}
	public double printn(double d) {
		System.out.println(d);
		return d;
	}
	public String printn(String s) {
		System.out.println(s);
		return s;
	}
	public static void main(String[] args) {
		PrintNumber a = new PrintNumber();
		
		a.printn(23.98);
		a.printn(45.08);
		a.printn(87);
		a.printn("something");
	}

}
