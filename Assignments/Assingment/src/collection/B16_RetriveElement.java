package collection;
//B16. Write a Java program to retrieve an element (at a specified index) from a given array list. 
import java.util.ArrayList;

public class B16_RetriveElement {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("red");
		strings.add("blue");
		strings.add("orange");
		strings.add("green");
		
		System.out.println(strings);
		
		String element = strings.get(0);
		System.out.println("First element: "+element);
		element = strings.get(2);
		System.out.println("Third element: "+element);
	}
}
