package collection;
//I4. Write a Java program of swap two elements in an array list. 
import java.util.ArrayList;
import java.util.Collections;

public class I4_Swap_element {
	public static void main(String[] args) {
		ArrayList<String> c1 =new ArrayList<String>();
		c1.add("php");
		c1.add("java");
		c1.add("ios");
		c1.add("android");
		c1.add("python");
		
		System.out.println("Array list before swap : ");
		for(String a:c1) {
			System.out.println(a);
		}
		Collections.swap(c1, 0, 2);
		System.out.println("Array list after swap: ");
		for(String b:c1) {
			 System.out.println(b);
		}
	}
}
