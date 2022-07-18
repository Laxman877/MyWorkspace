package array;

import java.util.Arrays;

public class Practice18 {
	static int area[]=new int[] {10,20,30,40,50};
	
	static void rotate_array() {
		int a=area[area.length-1],i;
		for(i=area.length-1;i>0;i--)
			area[i]=area[i-1];
		area[0]=a;
	}
	public static void main(String[] args) {
		System.out.println("original array: "+Arrays.toString(area));
		
		rotate_array();
		
		System.out.println("rotated array: "+Arrays.toString(area));
	}
}
