package collection;
//I8. Write a Java program to check whether a map contains key-value mappings (empty) or not.
import java.util.HashMap;

public class I8_TocheckKeyValue {
	public static void main(String[] args) {
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "java");
		hash_map.put(2, "php");
		hash_map.put(3, "ios");
		hash_map.put(4, "android");
		hash_map.put(5, "python");
		
		boolean result = hash_map.isEmpty();
		
		System.out.println("Is hash map empty: "+result);
		
		hash_map.clear();
		
		result = hash_map.isEmpty();
		
		System.out.println("Is hash map empty: "+result);
	}
}
