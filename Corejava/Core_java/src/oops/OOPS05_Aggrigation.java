package oops;

import java.net.InetAddress;

class Address{
	String country ="india";
	String state = "gujarat";
	String city = "surat";
	public void display() {
		System.out.println(country+" "+state+" "+city);
	}
}
class Employee{
	int id = 10;
	String name ="laxman";
	static Address adr = new Address();
	
	public void display() {
		System.out.println(id+" "+name);
	}
} 
public class OOPS05_Aggrigation {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.display();
		
		Employee.adr.display();
		
	}

}
