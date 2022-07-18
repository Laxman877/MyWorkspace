package collection;
//B22. Write a Java program to shuffle elements in a array list. 
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class B22_ShuffleEle {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("red");
		strings.add("blue");
		strings.add("orange");
		strings.add("green");
		strings.add("white");
		
		System.out.println("List before shuffling:\n"+strings);
		Collections.shuffle(strings);
		System.out.println("List after shuffling:\n"+strings);
		
	}
}
