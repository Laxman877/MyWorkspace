package collection;
//B26. Write a Java program to associate the specified value with the specified key in a HashMap.
import java.util.HashMap;
import java.util.Map;

public class B26_Key_value {
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(1, "red");
		hashmap.put(2, "blue");
		hashmap.put(3, "white");
		hashmap.put(4, "orange");
		hashmap.put(5, "green");
		
		System.out.println("Size of the hashmap: "+hashmap.size());
	}
}
