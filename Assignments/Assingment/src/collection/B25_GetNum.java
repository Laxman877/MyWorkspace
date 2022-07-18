package collection;
//B25. Write a Java program to get the number of elements in a hash set. 
import java.util.HashSet;

public class B25_GetNum {
	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		hset.add("red");
		hset.add("blue");
		hset.add("white");
		hset.add("orange");
		hset.add("green");
		
		System.out.println("The original hash set: "+hset);
		System.out.println("size of the hash set: "+hset.size());
	}
}
