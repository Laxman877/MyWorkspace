package basics;

import java.util.Scanner;

public class Ascii_of_Char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character: ");
		char c = sc.next().charAt(0);
		int i = c;
		System.out.println(i);
	}
}
