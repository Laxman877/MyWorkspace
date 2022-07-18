package fundamentals;

import java.util.Scanner;

public class Practice10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num is billion");
		if(sc.hasNextLong()) {
			long l=sc.nextLong();
			if(l<0) {
				l*=-1;
			}
			if(l>=10000000000L) {
				System.out.println("number is greater than or equal to 10000000000!");
			}else {
				int digits=1;
				if(l>=10 && l<100) {
					digits=2;
				}else if(l>=100 && l<1000) {
					digits=3;
				}else if(l>=1000 && l<10000) {
					digits=4;
				}else if(l>=10000 && l<100000) {
					digits=5;
				}else if(l>=100000 && l<1000000) {
					digits=6;
				}else if(l>=1000000 && l<10000000) {
					digits=7;
				}else if(l>=10000000 && l<100000000) {
					digits=8;
				}else if(l>=100000000 && l<1000000000) {
					digits=9;
				}else if(l>=1000000000 && l<10000000000L) {
					digits=10;
				}
				System.out.println("The number of digits is: "+digits);
			}
		}
	}
}
