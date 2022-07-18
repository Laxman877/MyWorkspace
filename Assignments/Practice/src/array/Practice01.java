package array;

import java.util.Arrays;

public class Practice01 {
	public static void main(String[] args) {
		int a[]= {8,5,9,7,4,6,3};
		System.out.println("original array is: "+Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("sorted array: "+Arrays.toString(a));
	}
}
 