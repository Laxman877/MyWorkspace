package string;

public class Practice05 {
	public static void main(String[] args) {
		String str1="Red is my faourite color";
		String str2="Orange is also my faourite color";
		
		String startstr="Red";
		
		boolean starts1=str1.startsWith(startstr);
		boolean starts2=str2.startsWith(startstr);
		
		System.out.println(str1+" starts with "+startstr+"? "+starts1);
		System.out.println(str2+" starts with "+startstr+"? "+starts2);
	}
}
