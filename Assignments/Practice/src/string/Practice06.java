package string;

import java.util.HashSet;
import java.util.Set;

public class Practice06 {
	public static void allInterLeaving(String res, String P, String Q, Set<String> out) {
		if(P.length() == 0 && Q.length() == 0) {
			out.add(res);
			return;
		}
		if(P.length()>0) {
			allInterLeaving(res+P.charAt(0), P.substring(1), Q, out);
		}
		if(Q.length()>0) {
			allInterLeaving(res+Q.charAt(0), P, Q.substring(1), out);
		}
	}
	public static void main(String[] args) {
		String P="WX";
		String Q="YZ";
		System.out.println("The given string are: "+P+" "+Q);
		System.out.println("The all interleaving Strings are: ");
		Set<String> out=new HashSet();
		allInterLeaving("", P, Q, out);
		
		out.stream().forEach(System.out::println);
	}
}
