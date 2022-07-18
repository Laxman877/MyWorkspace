package collection;
//B27.Write a Java program to count the number of key-value (size) mappings in a map. 
import java.util.HashMap;
import java.util.Map;

public class B27_SpecificKey {
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(1, "red");
		hashmap.put(2, "blue");
		hashmap.put(3, "white");
		hashmap.put(4, "orange");
		hashmap.put(5, "green");
		for(Map.Entry x:hashmap.entrySet()){
			System.out.println(x.getKey()+" "+x.getValue());
		}
		System.out.println("mapping size: "+hashmap.size());
	}
}
