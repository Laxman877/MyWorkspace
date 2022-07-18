package collection;
//B17. Write a Java program to update specific array element by given element. 
import java.util.ArrayList;
import java.util.Iterator;

public class B17_UpdateElement {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("red");
		strings.add("blue");
		strings.add("orange");
		strings.add("green");
		
		System.out.println(strings);
		
		strings.set(2, "yellow");
		Iterator itr =strings.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	}
}
