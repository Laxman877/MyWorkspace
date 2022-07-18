package oopsconcept;
/*I2. We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape'
with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and
'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth,
that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area'
containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of
rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods. */
import java.util.Scanner;

abstract class Shape{
	public abstract void RectangleArea(double length,double breadth);
	public abstract void SquareArea(double side);
	public abstract void CircleArea(double radius);
	
}

class Area extends Shape{
	@Override
	public void RectangleArea(double length, double breadth) {
		System.out.printf("Ractangle area = %.2f", length*breadth);
		System.out.println(" ");
	}
	@Override
	public void SquareArea(double side) {
		System.out.printf("Square area = %.2f", side*side);
		System.out.println(" ");
	}
	@Override
	public void CircleArea(double radius) {
		double PI=3.14;
		System.out.printf("Circle area = %.2f", PI*(radius*radius));
		System.out.println(" ");
	}
}
public class I2_Area_OOPs {
	public static void main(String[] args) {
		Area a = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer length for rectangle: ");
		double l=sc.nextDouble();
		System.out.println("Entrer breadth for rectangle: ");
		double b=sc.nextDouble();
		a.RectangleArea(l, b);
		System.out.println("Entrer side for square: ");
		double s=sc.nextDouble();
		a.SquareArea(s);
		System.out.println("Entrer radius for circle: ");
		double r=sc.nextDouble();
		a.CircleArea(r);
	}
}
