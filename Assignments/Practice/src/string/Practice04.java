package string;

public class Practice04 {
	public static void main(String[] args) {
		String str1="Python Excercises";
		String str2="Python Excercise";
		
		String ends_str="se";
		
		boolean ends1=str1.endsWith(ends_str);
		boolean ends2=str2.endsWith(ends_str);
		
		System.out.println("\""+str1+"\"ends with"+"\""+ends_str+"\"?"+ends1);
		System.out.println("\""+str2+"\"ends with"+"\""+ends_str+"\"?"+ends2);
	}
}
