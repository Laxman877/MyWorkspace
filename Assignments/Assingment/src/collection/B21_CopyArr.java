package collection;
//B21. Write a Java program to copy one array list into another. 
import java.util.ArrayList;
import java.util.Collections;

public class B21_CopyArr {
	public static void main(String[] args) {
		ArrayList<String> List1 = new ArrayList<String>();
		List1.add("1");
		List1.add("2");
		List1.add("3");
		List1.add("4");
		System.out.println("List1: "+List1);
		
		ArrayList<String> List2 = new ArrayList<String>();
		List2.add("A");
		List2.add("B");
		List2.add("C");
		List2.add("D");
		System.out.println("List2: "+List2);
		
		Collections.copy(List1, List2);
		System.out.println("Copy List1 to List2,\nAfter copy: ");
		System.out.println("List1: "+List1);
		System.out.println("List2: "+List2);
	}
}
