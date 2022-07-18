package basics;

import java.util.Scanner;

public class GreatNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if(x>y && x>z) {
			System.out.println("The greater value is: "+x);
		}else if(y>z) {
			System.out.println("The greater value is: "+y);
		}else {
			System.out.println("The greater value is:  "+z);
		}
	}
}
