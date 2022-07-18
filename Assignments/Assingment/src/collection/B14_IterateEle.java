package collection;
//B14. Write a Java program to iterate through all elements in a array list. 
import java.util.ArrayList;
import java.util.Iterator;

public class B14_IterateEle {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("red");
		strings.add("blue");
		strings.add("orange");
		strings.add("green");
		
//		for(String element : strings) {
//			System.out.println(element);
//		}
		Iterator itr = strings.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
