package oopsconcept;
/*I4. Create a class named 'Shape' with a method to print "This is This is shape". Then create two other
classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is
rectangular shape" and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle'
having a method to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class
by the object of 'Square' class.*/
class Shape1{
	public void print_Shape() {
		System.out.println("This is shape");
	}
}
class Rectangle1 extends Shape1{
	public void print_Rect() {
		System.out.println("This is rectangular shape");
	}
}
class Circle1 extends Shape1{
	public void print_Cir() {
		System.out.println("This is circular shape");
	}
}
class Square1 extends Rectangle1{
	public void print_Sq() {
		System.out.println("Square is rectangle");
	}
}
public class I4_Shape_OOPs {
	public static void main(String[] args) {
		Square1 sq = new Square1();
		sq.print_Shape();
		sq.print_Rect();
	}
}
