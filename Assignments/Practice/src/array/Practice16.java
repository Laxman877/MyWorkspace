package array;

import java.util.Arrays;

public class Practice16 {
	public static void main(String[] args) {
		int []arr= {10,45,47,63,77,45,-15,79};
		System.out.println("orirginal array; "+Arrays.toString(arr));
		int search_num=45;
		int fixed_sum=90;
		System.out.println("Result: "+result(arr, search_num, fixed_sum));
	}
	public static boolean result(int[] numbers, int search_num, int fixed_sum) {
		int temp_sum=0;
		for (int i : numbers) {
			if(i==search_num) {
				temp_sum=temp_sum+search_num;
			}
			if(temp_sum>fixed_sum) {
				break;
			}
		}
		return temp_sum==fixed_sum;
	}
}