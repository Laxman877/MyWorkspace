package oopsconcept;
/*B38. Create a class with a method that prints "This is a parent class" and its subclass with another
method that prints "This is child class". Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class*/
class Parent{
	public void display() {
		System.out.println("this is parent class...");
	}
}
class Child extends Parent {
	public void run() {
		System.out.println("this is child  class...");
	}
}
public class B38_OOPs {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		p.display();
		c.run();
		c.display();
	}

}
