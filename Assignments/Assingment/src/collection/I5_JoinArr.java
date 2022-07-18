package collection;
//I5. Write a Java program to join two array lists. 
import java.util.ArrayList;

public class I5_JoinArr {
	public static void main(String[] args) {
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("java");
		c1.add("php");
		c1.add("ios");
		c1.add("android");
		c1.add("python");
		System.out.println("List of first array: "+c1);
		ArrayList<String> c2 = new ArrayList<String>();
		c2.add("java");
		c2.add("php");
		c2.add("ios");
		c2.add("python");
		System.out.println("List of second array: "+c2);
		
		ArrayList<String> a= new ArrayList<String>();
		a.addAll(c1);
		a.addAll(c2);
		System.out.println("new aaray: "+a);
	}
}
