package array;

public class Array_Operation {

	public static void main(String[] args) {
		int a[]= {10,21,300,60,5,2,8,100};
		int sum=0;
		int max = a[0];
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min = a[i];
				
			}
		}
		System.out.println("Sum is : "+sum);
		System.out.println("avg is : "+(sum/a.length));
		System.out.println("max is : "+max);
		System.out.println("min is : "+min);
	}
}
