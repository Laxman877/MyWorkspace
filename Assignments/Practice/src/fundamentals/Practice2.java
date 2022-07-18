package fundamentals;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter alphabet");
		String input=sc.next().toLowerCase();
		
		boolean uppercase=input.charAt(0)>=65 && input.charAt(0)<90;
		boolean lowercase=input.charAt(0)>=97 && input.charAt(0)<122;
		boolean vowels=input.equals("a")||input.equals("e")||input.equals("i")||input.equals("o")||input.equals("u");
		
		if(input.length()>1) {
			System.out.println("error not a single character");
		}else if(!(uppercase || lowercase)) {
			System.out.println("error please enter letter");
		}else if(vowels) {
			System.out.println("character is vowel");
		}else {
			System.out.println("charater is consonant");
		}
	}
}
