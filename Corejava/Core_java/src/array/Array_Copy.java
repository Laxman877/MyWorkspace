package array;

public class Array_Copy {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60,70};
		int n[] = new int [10];
		
		System.arraycopy(a, 2, n, 4, 3);
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i]);
		}
		
	}
}
