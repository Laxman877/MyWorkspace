package array;

public class Practice12 {
	public static void main(String[] args) {
		String []a= {"java","php","pythone","php","css","java"};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if((a[i]==a[j])&& i!=j) {
					System.out.println("duplicate string: "+a[j]);
				}
			}
		}
	}
}
