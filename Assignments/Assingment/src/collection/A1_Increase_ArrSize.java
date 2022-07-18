package collection;
//A1. Write a Java program to increase the size of an array list. 
import java.util.ArrayList;

public class A1_Increase_ArrSize {
	public static void main(String[] args) {
		ArrayList<String> strings =new ArrayList<String>(3);
		strings.add("audi");
		strings.add("bugati");
		strings.add("bmw");
		System.out.println("Original arraylist: "+strings);
		
		strings.ensureCapacity(6);
		strings.add("ford");
		strings.add("honda");
		strings.add("ennova");
		System.out.println("Inceased arraylist: "+strings);
	}
}
