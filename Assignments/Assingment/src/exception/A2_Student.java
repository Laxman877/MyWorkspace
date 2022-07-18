package exception;
/*A2. W.A.J.P to create a class Student with attributes roll no, name, age and course. Initialize values
through parameterized constructor. If age of student is not in between 15 and 21 then generate
userdefined exception "AgeNotWithinRangeException". If name contains numbers or special symbols
raise exception "NameNotValidException". Define the two exception classes. */
//incomplete
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class student{
	int age;
	int rollno;
	String course;
	String name;

	student(){
		System.out.println("\nObject Created:");
		rollno=0;
		age=0;
		name="No Name Assigned";
	}
	student(int rollno,int age,String name,String cource){ 
		System.out.println("\nObject created");
		this.rollno=rollno;
		this.age=age;
		this.name=name;
		this.course=course;

	}
	void display(){
		System.out.println("\nRoll no : "+rollno+"; Name : "+name+"; Age : "+age+"; Course : "+course);
	}
}
class AgeNotWithinRangeException extends Exception{
	public AgeNotWithinRangeException(String s){
		super(s);
	}
}
class NameNotValidException extends Exception{
	public NameNotValidException(String s){
		super(s);
	}
}
public class A2_Student {
	public static void main(String[] args) {
		try{
			int n,a,b;
			char []c;
			String c1,d;

			System.out.println("\nEnter no of students : ");

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			n=Integer.parseInt(br.readLine());


			student o[]=new student[n];
			System.out.println("\nEnter data : ");

			for(int i=0;i<n;i++){ 
				System.out.print("\nRoll No : ");
				a=Integer.parseInt(br.readLine());
				System.out.print("\nAge : ");

				b=Integer.parseInt(br.readLine());
				if(b>21 || b<15)
					throw new AgeNotWithinRangeException("Age Not Valid");
				System.out.print("\nName : ");
				c1=br.readLine();
				c=c1.toCharArray();

				for(int j=0;j<c1.length();j++){
					if (! Character.isLetter(c[j]))
						throw new NameNotValidException("\nName contains digits or special characters");
				}
				System.out.print("\nCourse : ");
				d=br.readLine();
				o[n]=new student(a,b,c1,d);

			}
			System.out.println("\nData : ");
			for(int i=0;i<n;i++)
				o[i].display();
		}catch(IOException e){

			System.out.println(e);

		}catch(AgeNotWithinRangeException e){

			System.out.println(e);

		}catch(NameNotValidException e){

			System.out.println(e);
		}
	}
}
