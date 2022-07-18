package collection;
//B15. Write a Java program to insert an element into the array list at the first position. 
import java.util.ArrayList;
import java.util.Iterator;

public class B15_InsertElement {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("red");
		strings.add("blue");
		strings.add("orange");
		strings.add("green");
		System.out.println(strings);
		strings.add(0, "pink");
//		System.out.println(strings);
		Iterator itr = strings.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
