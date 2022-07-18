package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "java");
		map.put(15, "php");
		map.put(13, "ios");
		map.put(10, "android");
		
//		System.out.println(map);
//		System.out.println(map.get(10));
		Set s = map.entrySet();
		
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
