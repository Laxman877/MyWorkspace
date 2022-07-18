package oopsconcept;
/*B39. Create a class named 'Member' having the following members:
Data members 1 - Name 2 - Age 3 - Phone number 4 - Address 5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager'
classes have data members 'specialization' and 'department' respectively. Now, assign name, age,
phone number, address and salary to an employee and a manager by making an object of both of these
classes and print the same. */
class Member{
	String name;
	int age;
	String phonenumber;
	String address;
	double salary;
	
	public Member(String name, int age, String phonenumber, String address, double salary) {
		this.name=name;
		this.age=age;
		this.phonenumber=phonenumber;
		this.address=address;
		this.salary=salary;
		
	}
	public void printsalary() {
		System.out.println(name+" "+age+" "+phonenumber+" "+address+" "+"Salary "+salary);
	}
}
class Employee extends Member{
	String specialization;
	
	public Employee(String name, int age, String phonenumber, String address, double salary,String specialization) {
		super(name, age, phonenumber, address, salary);
		this.specialization = specialization;
	}
}
class Manager extends Member{
	String department;
	public Manager(String name, int age, String phonenumber, String address, double salary, String department) {
		super(name, age, phonenumber, address,salary);
		this.department = department;
	}
}
public class B39_OOPs {
	public static void main(String[] args) {
		Employee emp = new Employee("piyush", 25, "0123456789", "12 surat gujarat", 25745.33, "IT");
		Manager mng = new Manager("jaydip", 29, "9876543210", "45 udhna gujarat", 40965.45, "IT");
		emp.printsalary();
		mng.printsalary();
		
	}

}
