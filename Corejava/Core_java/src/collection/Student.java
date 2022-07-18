package collection;

public class Student implements Comparable<Student>{
	int id;
	String name;
	String email;
	
	public Student(int id, String name ,String email) {
		this.id=id;
		this.name=name;
		this.email=email;
		
	}
	public void display() {
		System.out.println(id+" "+name+" "+email);
	}
	public String toString() {
		return "Student [id="+id+",name="+name+",email="+email+"]";
	}
	public int compareTo(Student o) {
		int id1 = o.id;
		int id2 = this.id;
		int i=0;
		if(id1>id2) {
			i=-1;
		}else if(id1<id2) {
			i=+1;
		}else if(id1==id2) {
			i=0;
		}
		return i;
	}
}
