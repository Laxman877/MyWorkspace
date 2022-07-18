package library;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		int choice;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your choice!");
		System.out.println("0: exit");
		System.out.println("1: add book");
		System.out.println("2: delete book");
		System.out.println("3: issue book");
		System.out.println("4: view book");
		choice = sc.nextInt();
		LibraryOperation lo= new LibraryOperation();
		switch(choice) {
		case 1:
			lo.addBook();
			break;
		case 2:
			lo.deleteBook();
			break;
		case 3:
			lo.issueBook();
			break;
		case 4:
			lo.viewBook();
			break;
		case 0:
			System.out.println("***Exit***");
			break;
		default:
			System.out.println("invalid choice please enter correct");
			break;
		}
		}while(choice!=0);
	}
}
