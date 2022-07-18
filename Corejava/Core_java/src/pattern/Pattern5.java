package pattern;

public class Pattern5 {

	public static void main(String[] args) {
		int lines = 5;
		int starcount = 1;
		for(int j=1;j<=lines;j++) {
			for(int i=1;i<=starcount;i++) {
				if((i%2)==(j%2)){
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			}
			System.out.println();
			starcount++;
		}
	}
}
