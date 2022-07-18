package collection;
//A5.Write a Java program to get a collection view of the values contained in this map. 
import java.util.HashMap;
import java.util.Iterator;

public class A5_Collection_View {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "red");
		map.put(2, "orange");
		map.put(3, "white");
		map.put(4, "green");
		map.put(5, "blue");
		
		System.out.println("Collection view is: "+map.values());
	}
}
