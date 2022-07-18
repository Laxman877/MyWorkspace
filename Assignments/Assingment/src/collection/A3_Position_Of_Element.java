package collection;
//A3. Write a Java program to print all the elements of a ArrayList using the position of the elements. 
import java.util.ArrayList;

public class A3_Position_Of_Element {
	public static void main(String[] args) {
		ArrayList<String> a1 =new ArrayList<String>();
		a1.add("java");
		a1.add("php");;
		a1.add("ios");
		a1.add("android");
		a1.add("python");
		System.out.println("\nOriginal arraylist: "+a1);
		System.out.println("\nPrint using index of element: ");
		int num_of_element = a1.size();
		for(int i=0;i<num_of_element;i++) {
			System.out.println(a1.get(i));
		}
	}
}
