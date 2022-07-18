package fundamentals;

public class Practice11 {
	public static void main(String[] args) {
		String s="how are you? how is going yoyr it training? from last 123 days!";
		count(s);
	}

	private static void count(String x) {
		char ch[]=x.toCharArray();
		int letter=0;
		int space=0;
		int num=0;
		int other=0;
		for(int i=0;i<x.length();i++) {
			if(Character.isLetter(ch[i])) {
				letter++;
			}else if(Character.isSpaceChar(ch[i])) {
				space++;
			}else if(Character.isDigit(ch[i])) {
				num++;
			}else {
				other++;
			}
		}
		System.out.println("how are you? how is going yoyr it training? from last 123 days!");
		System.out.println("letter: "+letter);
		System.out.println("space: "+space);
		System.out.println("digits: "+num);
		System.out.println("others: "+other);
	}
}
