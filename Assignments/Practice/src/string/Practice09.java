package string;

public class Practice09 {
	static void splitstring(String str, int n) {
		int str_size=str.length();
		int part_size;
		if(str_size % n!=0) {
			System.out.println("the size of the given string is: "+n);
			return;
		}else {
			System.out.println("the given string is: "+str);
			System.out.println("the string divided into "+n+" parts and they are: ");
			part_size=str_size/n;
			for(int i=0;i<str_size;i++) {
				if(i%part_size==0) 
					System.out.println();
				System.out.print(str.charAt(i));
			}
		}
	}
	public static void main(String[] args) {
		String str="abcdefghijklmnopqrstuvwxy";
		int splitnumber=5;
		splitstring(str, splitnumber);
	}
}
