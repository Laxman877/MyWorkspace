package oopsconcept;
/*B37. Create a class to print the area of a square and a rectangle. The class has two methods with the
same name but different number of parameters. The method for printing area of a rectangle has two
parameters which are length and breadth respectively while the other method for printing area of
square has one parameter which is side of square. */
public class PrintArea {
	void area(float side) {
		float a =side*side;
		System.out.println("the square of area is: "+a+"sq units");
	}
	void area(float length, float breadth){
		System.out.println("the area of rectangle is: "+length * breadth +"sq units");
	}
	public static void main(String[] args) {
		PrintArea a = new PrintArea();
		a.area(6);
		a.area(8, 6);
	} 
	

}
