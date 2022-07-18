package fundamentals;

import java.util.Scanner;

public class Practice17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int n=sc.nextInt();
		System.out.println("enter second number");
		int m=sc.nextInt();
		System.out.println("Result : "+common_digit(n,m));
	}
	public static boolean common_digit(int p,int q) {
		if(p<25||q>75) {
			return false;
		}
		int x=p%10;
		int y=q%10;
		p/=10;
		q/=10;
		return (p==q||p==y||x==q||x==y);
	}
}
