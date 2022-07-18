package pattern;

public class Pattern4 {
	public static void main(String[] args) {
		int lines = 9;
		int starcount = 1;
		int spacecount = lines -1;
		int mid = (lines/2)+1;
		for(int j=1;j<=lines;j++){
			for(int k=1;k<=spacecount;k++) {
				System.out.print(" ");
			}
			for(int i=1;i<=starcount;i++) {
				System.out.print("*");
			}
			System.out.println();
			if(j<mid) {
				starcount+=2;
				spacecount--;
				
			}else {
				starcount-=2;
				
				spacecount++;
			}
		}
	}

}
