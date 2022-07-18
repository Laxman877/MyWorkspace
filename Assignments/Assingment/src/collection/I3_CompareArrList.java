package collection;
//I3. Write a Java program to compare two array lists. 
import java.util.ArrayList;

public class I3_CompareArrList {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("galaxy");
		a1.add("solaris");
		a1.add("meteor");
		a1.add("meteorite");
		a1.add("ultra");
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("galaxy");
		a2.add("neptune");
		a2.add("meteor");
		a2.add("ultra");
		
		ArrayList<String> a3 = new ArrayList<String>();
		for(String e:a1)
			a3.add(a2.contains(e) ? "yes":"no");
		System.out.println("same content is on same index: "+a3);
	}
}
