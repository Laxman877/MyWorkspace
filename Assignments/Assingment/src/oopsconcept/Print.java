package oopsconcept;
/*B36. Create a class to print an integer and a character with two methods having the same name but
different sequence of the integer and the character parameters. */
public class Print {
	void printn(int a, char c) {
		System.out.println("Integer is: "+a+"\t char is: "+c);
	}
	void printn(char c, int a) {
		System.out.println("char is: "+c+"\tInteger is: "+a);
	}
	public static void main(String[] args) {
		Print obj = new Print();
		obj.printn('g', 10);
		obj.printn(15, 'j');
	}

}
