package array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
		int arr[]= {12,45,78,96,45,14,35,61,47,58};
		System.out.println("your array is: "+Arrays.toString(arr));
		
		Scanner input=new Scanner(System.in);
		System.out.println("\ninput the index you wann remove");
		int num=input.nextInt();
		
		int arr1[];
		arr1=new int[9];
		int a=0;
		
		for(int i=0;i<arr.length;i++) {
			if(i!=num) {
				arr1[a]=arr[i];
				a++;
			}
		}
		System.out.println("new array: "+Arrays.toString(arr1));
	}
}
