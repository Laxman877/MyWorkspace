package fundamentals;

import java.util.Scanner;

public class Practice19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		double n1=sc.nextDouble();
		System.out.println("enter second number");
		double n2=sc.nextDouble();
		System.out.println(n1>0 && n1<1 && n2>0 && n2<1);
	}
}
