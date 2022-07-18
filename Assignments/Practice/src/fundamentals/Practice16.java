package fundamentals;

import java.util.Scanner;

public class Practice16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int x=sc.nextInt();
		System.out.println("enter second number");
		int y=sc.nextInt();
		System.out.println("enter third number");
		int z=sc.nextInt();
		System.out.println("the result is: "+sumoftwo(x,y,z));
	}
	public static boolean sumoftwo(int p,int q,int r) {
		return ((p+q)==r||(p+r)==q||(q+r)==p);
	}
}
