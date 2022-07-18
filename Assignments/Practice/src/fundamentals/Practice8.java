package fundamentals;

public class Practice8 {
	public static void main(String[] args) {
		int lines=5;
		int count=1;
		for(int i=1;i<=lines;i++) {
			for(int j=1;j<=count;j++) {
				if((i%2)==(j%2)) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
			count++;
		}
	}
}
