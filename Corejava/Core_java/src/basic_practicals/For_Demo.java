package basic_practicals;

public class For_Demo {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		
		for(int i=10;i>=1;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int num=15;
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+" = "+(num*i));
		}
	}
}
