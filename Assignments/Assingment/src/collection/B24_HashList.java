package collection;
//B24. Write a Java program to iterate through all elements in a hash list. 
import java.util.HashSet;
import java.util.Iterator;

public class B24_HashList {
	public static void main(String[] args) {
		HashSet<String> Hset = new HashSet<String>();
		Hset.add("black");
		Hset.add("red");
		Hset.add("orange");
		Hset.add("pink");
		Hset.add("yellow");
		
		Iterator<String> itr = Hset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
