package array;

public class Practice13 {
	public static void main(String[] args) {
		int arr[]= {12,45,3,24,65,78,41,88,25,47,96};
		int max=arr[0];
		int sec_max=arr[1];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				sec_max=max;
				max=arr[i];
			}else if(arr[i]>sec_max && arr[i]!=max){
				sec_max=arr[i];
			}
		}
		System.out.println("the largest value is: "+max);
		System.out.println("the second large value is: "+sec_max);
	}
}
