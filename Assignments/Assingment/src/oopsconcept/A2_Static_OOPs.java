package oopsconcept;
/*A2. Suppose a class 'A' has a static method to print "Parent". Its subclass 'B' also has a static method
with the same name to print "Child". Now call this method by the objects of the two classes. Also, call
this method by an object of the parent class referring to the child class i.e. A obj = new B () */
class A1{
	static void display() {
		System.out.println("Parent class...");
	}
}
class B1 extends A1{
	static void display() {
		System.out.println("Child class...");
	}
}
public class A2_Static_OOPs {
	public static void main(String[] args) {
		A1 o = new B1();
		o.display();
		B1 b = new B1();
		b.display();
	}
}
