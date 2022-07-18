package collection;
//I6. Write a Java program to convert a hash set to an array. 
import java.util.HashSet;

public class I6_HashSet_Arr {
	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		hset.add("red");
		hset.add("blue");
		hset.add("green");
		hset.add("white");
		hset.add("pink");
		System.out.println("original hash set: "+hset);
		
		String[] new_arr = new String[hset.size()];
		hset.toArray(new_arr);
		
		System.out.println("Array elements: ");
		for(String element : new_arr) {
			System.out.println(element);
		}
	}
}
