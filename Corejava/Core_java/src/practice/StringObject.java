package practice;
class Demo{
	int id = 10;
	String name = "Tops";
	public String toString() {
		return "Id: "+id+"\nName: "+name;
		
	}
}
public class StringObject {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d);
	}
	
}
