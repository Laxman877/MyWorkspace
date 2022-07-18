package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentCollection {
	public static void main(String[] args) {
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(new Student(5,"daksh","dks@gmail.com"));
		st.add(new Student(7,"moksh","kash@gmial.com"));
		st.add(new Student(9,"ram","ram32@gmail.com"));
		st.add(new Student(6,"namu","manu@gmail.com"));
		
		//Collections.sort(st);
		
		Iterator<Student> itr = st.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			Student s = itr.next();
			s.display();
		}
	}
}
