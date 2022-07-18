package array;

public class Practice06 {
	public static void main(String[] args) {
		int arr[]= {15,85,45,61,75,98,12,34,11};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("the max value is: "+max);
		System.out.println("the min valus is: "+min);
	}
}
