package fundamentals;

import java.util.Scanner;

public class Practice12 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter character");
		char ch=sc.next().charAt(0);
		int asciivalue=ch;
		System.out.println("ascii value of character: "+ch+"\nis: "+asciivalue);
	}
}
