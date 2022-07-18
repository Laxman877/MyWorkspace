package array;

import java.util.Arrays;

public class Practice10 {
	 public static void main(String[] args) {
		int []arr= {1245,3654,1452,7458,1234,
					2145,3251,4576,1256,1456,
					1256,5896,1452,3547};
		System.out.println("the original arrays: "+Arrays.toString(arr));
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		System.out.println("reverse alement of array: "+Arrays.toString(arr));
	 }
}
