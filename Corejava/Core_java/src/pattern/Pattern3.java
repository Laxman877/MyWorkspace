package pattern;

public class Pattern3 {
	public static void main(String[] args) {
		int lines = 5;
		int starcount = 1;
		int spacecount = lines-1;
		for(int j=1;j<=lines;j++) {
			for(int k=1;k<=spacecount;k++) {
				System.out.print(" ");
			}
			for(int i=1;i<=starcount;i++) {
				System.out.print("*");
			}
			System.out.println();
			starcount+=2;
			spacecount--;
		}
	}

}
