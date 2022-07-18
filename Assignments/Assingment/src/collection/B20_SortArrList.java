package collection;
//B20. Write a Java program to sort a given array list. 
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class B20_SortArrList {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("red");
		strings.add("blue");
		strings.add("orange");
		strings.add("green");
		strings.add("white");
		
		System.out.println("List Before sorting: "+strings);
		Collections.sort(strings);
		System.out.println("List after sort: "+strings);
	}
}
