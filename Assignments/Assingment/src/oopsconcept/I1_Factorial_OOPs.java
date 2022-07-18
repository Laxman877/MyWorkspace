package oopsconcept;
/*I1. Write a program to print the factorial of a number by defining a method named 'Factorial'.
Factorial of any number n is represented by n! and is equal to 1*2*3*.... *(n-1) *n. */
public class I1_Factorial_OOPs {
	public static int Factorial(int n) {
		if(n<1) {
			return 1;
		}else {
			return Factorial(n-1)*n;
		}
	}
	public static void main(String[] args) {
		System.out.println(Factorial(4));
		System.out.println(Factorial(3));
		System.out.println(Factorial(2));
		System.out.println(Factorial(1));
		System.out.println(Factorial(0));//didn't get 0;
	}
}
