package array;

public class Practice04 {
	public static boolean contains(int arr[],int item) {
		for(int n:arr) {
			if(item==n) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[]= {2022,2013,1956,1975,2020,2045};
		System.out.println("the value is: "+contains(arr, 2013));
		System.out.println("the value is:  "+contains(arr, 1947));
	}
}
