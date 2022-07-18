package collection;
//B18. Write a Java program to remove the third element from a array list. 
import java.util.ArrayList;
import java.util.Iterator;

public class B18_RemElement {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("red");
		strings.add("blue");
		strings.add("orange");
		strings.add("green");
		strings.add("white");
		
		System.out.println(strings);
		
		strings.remove(2);
		Iterator itr = strings.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
//		System.out.println("After Removing Third Element from the list:\n"+strings);
	}
}
