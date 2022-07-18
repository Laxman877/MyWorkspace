package basics;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = x+y;
		System.out.println("the sum of two numbers is : "+sum);
		int sub = x-y;
		System.out.println("the sub of two numbers is : "+sub);
		int mul = x*y;
		System.out.println("the mul of two numbers is : "+mul);
		int div = x/y;
		System.out.println("the div of two numbers is : "+div);
		int mdiv =x%y;
		System.out.println("the mdiv of two numbrers is : "+mdiv);
	}
}
