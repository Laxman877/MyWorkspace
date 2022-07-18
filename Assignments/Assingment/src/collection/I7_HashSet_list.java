package collection;
//I7. Write a Java program to convert a hash set to a List/ArrayList. 
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class I7_HashSet_list {
	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		hset.add("red");
		hset.add("blue");
		hset.add("green");
		hset.add("white");
		hset.add("pink");
		System.out.println("original hash set: "+hset);
		
		List<String> list = new ArrayList<String>(hset);
		
		System.out.println("Arraylist contains: "+list);
	}
}
