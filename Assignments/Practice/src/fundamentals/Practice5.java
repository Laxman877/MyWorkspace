package fundamentals;

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=0;
		int sum=0;
		double avg;
		for(int i=0;i<5;i++) {
			num=sc.nextInt();
			sum+=num;
		}
		avg=sum/5;
		System.out.println("the sum of num is: "+sum+"\navg of num is: "+avg);
	}
}
