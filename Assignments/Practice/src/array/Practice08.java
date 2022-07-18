package array;

import java.util.Arrays;

public class Practice08 {
	public static void main(String[] args) {
		int arr[]= {12,45,63,14,25,78,96,45,12,34};
		int arr1[]=new int[10];
		
		System.out.println("sorce array: "+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		System.out.println("the new arry: "+Arrays.toString(arr1));
	}
}
