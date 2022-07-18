package collection;
//A4. Write a Java program to compare two sets and retain elements which are same on both sets.
import java.util.HashSet;

public class A4_Compare_Two_Set {
	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Tv");
		set1.add("laptop");
		set1.add("mobile");
		set1.add("refrigerator");
		System.out.println("First hashset content: "+set1);
		
		HashSet<String> set2 = new HashSet<String>();
		set2.add("Tv");
		set2.add("Cpu");
		set2.add("mobile");
		set2.add("Ac");
		System.out.println("Second hashset content: "+set2);
		
		set1.retainAll(set2);
		System.out.println("HashSet content: ");
		System.out.println(set1);
	}
}
