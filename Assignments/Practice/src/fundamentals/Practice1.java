package fundamentals;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number to comapre");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		if(x>y && x>z) {
			System.out.println("the greatest value is: "+x);
		}else if(y>z) {
			System.out.println("the greatest value is: "+y);
		}else {
			System.out.println("the geratest value is : "+z);
		}
	}
}
