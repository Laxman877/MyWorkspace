package practice;

public class StringDemo1 {
	public static void main(String[] args) {
		//String literals
		String s = new String("java");
		String s1 = new String("php");
		String s2 = new String("java");
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s==s1);
		System.out.println(s==s2);
		
		
		String str ="java";
		String str1 ="php";
		String str2 = "java";
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
		System.out.println(str==str1);
		System.out.println(str==str2);
	}

}
