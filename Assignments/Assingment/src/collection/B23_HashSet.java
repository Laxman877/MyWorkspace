package collection;
//B23. Write a Java program to append the specified element to the end of a hash set. 
import java.util.HashSet;
import java.util.Iterator;

public class B23_HashSet {
	public static void main(String[] args) {
		HashSet<String> Hset = new HashSet<String>();
		Hset.add("black");
		Hset.add("red");
		Hset.add("orange");
		Hset.add("pink");
		Hset.add("yellow");
		
		System.out.println(Hset);
	}
}
