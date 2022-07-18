package string;

public class Practice10 {
	static final int max_char=256;
	static void CountCharacters(String str1,int[] ctr) {
		for(int i=0;i<str1.length();i++) {
			ctr[str1.charAt(i)]++;
		}
	}
		static void showDuplicates(String str1) {
			int ctr[]=new int[max_char];
			CountCharacters(str1, ctr);
			for(int i=0;i<max_char;i++) {
				if(ctr[i]>1)
					System.out.printf("%c appears %d times\n",i,ctr[i]);
			}
		}
	
	public static void main(String[] args) {
		String str1="w3resource tops technologies";
		System.out.println("the given string is: "+str1);
		System.out.println("the duplicate count and characters are: ");
		showDuplicates(str1);
	}
}
