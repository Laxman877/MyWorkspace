package array;

public class Practice03 {
	public static void main(String[] args) {
		int arr[]= {15,78,34,95,61,48,74};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		double avg=sum/arr.length;
		System.out.println("the sum of the arrayis : "+sum+"\nthe avg of the array is : "+avg);
	}
}
 