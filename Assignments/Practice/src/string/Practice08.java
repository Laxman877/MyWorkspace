package string;

public class Practice08 {
	public static void main(String[] args) {
		String str1="gibblegabbler";
		System.out.println("The gievn string are: "+str1);
		for(int i=0;i<str1.length();i++) {
			boolean unique=true;
			for(int j=0;j<str1.length();j++) {
				if(i!=j && str1.charAt(i)==str1.charAt(j)) {
					unique=false;
					break;
				}
			}
			if(unique) {
				System.out.println("The non reapeting character in string  is: "+str1.charAt(i));
				break;
			}
		}
	}
}
