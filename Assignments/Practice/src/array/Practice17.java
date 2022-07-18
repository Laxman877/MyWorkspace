package array;

import java.util.Arrays;

public class Practice17 {
	public static void main(String[] args) {
		int num[]= {0,1,0,1,0,1,1,1,0,0,0,1,0,1};
		int i, num_size=num.length;
		int left =0, right=num_size-1;
		
		System.out.println("original array: "+Arrays.toString(num));
		while(left<right) {
			while(num[left]==0 && left<right)
				left++;
			while(num[right]==1 && left<right)
				right--;
			if(left<right) {
				num[left]=0;
				num[right]=1;
				left++;
				right--;
			}
		}
		System.out.println("array  after segregation: "+Arrays.toString(num));
	}
}