package collection;
//I2. Write a Java program to extract a portion of a array list. 
import java.util.ArrayList;
import java.util.List;

public class I2_ExtractAL {
	public static void main(String[] args) {
		
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("java");
		strings.add("php");
		strings.add("python");
		strings.add("ios");
		strings.add("android");
		System.out.println("original list : "+strings);
		List<String> sub_list = strings.subList(0, 3);
		System.out.println("List of first three element: "+sub_list);
		
	}
}
