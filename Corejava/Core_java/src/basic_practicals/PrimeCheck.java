package basic_practicals;

import java.util.Scanner;

public class PrimeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number to check prime or not");
		int n = sc.nextInt();
//		for(int n ; n<=100;n++) {
			int flag = 0;
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==00) {
				System.out.println(n+" is prime number");
			}
			else
			{
				System.out.println(n+" is not prime number");
			}
//		}
	}

}
