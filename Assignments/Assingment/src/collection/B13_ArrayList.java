package collection;
//B13. Write a Java program to create a new array list, add some colors (string) and print out the collection
import java.util.ArrayList;
import java.util.Iterator;

public class B13_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("red");
		strings.add("blue");
		strings.add("orange");
		strings.add("green");
//		System.out.println(strings);
		Iterator itr = strings.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
