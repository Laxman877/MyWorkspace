package basics;

import java.util.Scanner;

public class Calculator_Switch {
	public static void main(String[] args) {
		int select=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st num: ");
		int n1 = sc.nextInt();
		System.out.println("enter 2nd num: ");
		int n2 = sc.nextInt();
		System.out.println("select operation");
		System.out.println("1 for add: ");
		System.out.println("2 for sub: ");
		System.out.println("3 for mul: ");
		System.out.println("4 for div: ");
		select = sc.nextInt();
		switch(select) {
		case 1:
			 System.out.println("sum of two num is : "+(n1+n2));
			 break;
		case 2:
			System.out.println("sub of two num is : "+(n1-n2));
			break;
		case 3:
			System.out.println("mul of two num is : "+(n1*n2));
			break;
		case 4:
			System.out.println("div of two num is : "+(n1/n2));
			break;
		default:
			System.out.println("invalid entry try again");
		}
	}

}
