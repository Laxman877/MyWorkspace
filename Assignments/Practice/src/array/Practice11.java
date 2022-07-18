package array;

public class Practice11 {
	public static void main(String[] args) {
		int a[]= {4,5,27,8,9,6,1,4,5,2};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if((a[i]==a[j])&& i!=j) {
					System.out.println("duplicate elemnt: "+a[j]);
				}
			}
		}
	}
}
