package oopsconcept;
/*B41. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
creating a class named 'Triangle' without any parameter in its constructor. */
class Triangle{
	int a, b , c;
	public double getArea() {
		double s = (a+b+c)/2.0;
		return Math.pow((s*(s-a)*(s-b)*(s-c)), 0.5);
		
	}
	public double gerPerimeter() {
		return (a+b+c)/2.0;
	}
}
public class B41_Triangle_OOPs {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.a=3;
		t1.b=4;
		t1.c=5;
		System.out.println(t1.getArea());
		System.out.println(t1.gerPerimeter());
	}

}
