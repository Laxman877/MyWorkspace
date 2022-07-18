package oops;
class Calc1
{
	public void add(int a, int b)
	{
		int  r = a+b;
		System.out.println("m1 : "+r);
	}
	
	public void add(int a, int b, int c)
	{
		int  r = a+b+c;
		System.out.println("m2 : "+r);
	}
	
	public void add(int a, double b)
	{
		double  r = a+b;
		System.out.println("m3 : "+r);
	}
}
public class OOPS10_MethodOverloading {
	public static void main(String[] args) {
		Calc1 c = new Calc1();
		c.add(10, 20, 30);
		c.add(20, 30.23);
		c.add(50, 70);
	}

}
