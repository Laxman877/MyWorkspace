package collection;
//A2. Write a Java program to replace the second element of a ArrayList with the specified element. 
import java.util.ArrayList;

public class A2_Rem_2nd_element {
	public static void main(String[] args) {
		ArrayList<String> colour = new ArrayList<String>();
		 colour.add("yellow");
		 colour.add("red");
		 colour.add("pink");
		 System.out.println("original arraylist: "+colour);
		 
		 String new_colour = "white";
		 colour.set(1, new_colour);
		 
		 int num = colour.size();
		 System.out.println("Replace second element with 'white'.");
		 for(int i=0;i<num;i++) {
			 System.out.println(colour.get(i));
		 }
	}
}
