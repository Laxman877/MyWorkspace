package array;

public class Practice05 {
	public static int findindex(int arr[],int n) {
		if(arr==null) return -1;
		int len=arr.length;
		int i=0;
		while(i<len) {
			if(arr[i]==n) return i;
			else i=i+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {5,9,3,4,7,8,1,25,41};
		System.out.println("the index of 7 is: "+findindex(arr, 7));
	}
}