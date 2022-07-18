package array;

import java.util.Arrays;

public class Practice15 {
	public static void main(String[] args) {
		int num[]= {5,7,3,4,9,6,8,2};
		System.out.println("original array: "+Arrays.toString(num));
		int max=num[0];
		int min=num[0];
		float sum=num[0];
		for(int i=1;i<num.length;i++) {
			sum=sum+num[i];
			if(num[i]>max) {
				max=num[i];
			}else if(num[i]<min) {
				min=num[i];
			}
		}
		float x=((sum-max-min)/(num.length-2));
		System.out.printf("compute the average value of an array of integers: %.2f",x);
		System.out.print("\n");
	}
}
