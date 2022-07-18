package practice;

public class StringMethods {
	public static void main(String[] args) {
		
		String s = "Holi is the Festival of colours";
		
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.indexOf('t'));
		System.out.println(s.charAt(12));
		System.out.println(s.replace('t', 'z'));
		System.out.println(s.substring(16));
		System.out.println(s.substring(4, 20));
		System.out.println(s.trim());
		System.out.println("**********");
		String sa[]=s.split("");
		for(int i=0;i<sa.length;i++) {
			System.out.println(sa[i]);
		}
		System.out.println("********");
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		System.out.println("***********");
		byte b[]=s.getBytes();
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
	}

}
