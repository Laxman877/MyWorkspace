package collection;
//I1. Write a Java program to reverse elements in a array list. 
import java.util.ArrayList;
import java.util.Collections;

public class I1_RevElementAL {
	public static void main(String[] args) {
		
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("java");
		strings.add("php");
		strings.add("python");
		strings.add("ios");
		strings.add("android");
		System.out.println("List before reversing :\n"+strings);
		Collections.reverse(strings);
		System.out.println("List after reversing :\n"+strings);
		
	}
}
