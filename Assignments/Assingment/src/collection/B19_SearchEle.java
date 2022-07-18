package collection;
//B19. Write a Java program to search an element in a array list. 
import java.util.ArrayList;

public class B19_SearchEle {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("red");
		strings.add("blue");
		strings.add("orange");
		strings.add("green");
		strings.add("white");
		if(strings.contains("green")) {
			System.out.println("Found the element");
		}else {
			System.out.println("there is no such element");
		}
	}
}
