package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeCollection {
	public static void main(String[] args) {
		ArrayList<Employee> st = new ArrayList<Employee>();
		st.add(new Employee(10,"tops","123@gmail.com"));
		st.add(new Employee(13,"google","sa32@gmail.com"));
		st.add(new Employee(7,"infosys","info@gmail.com"));
		st.add(new Employee(9,"tcs","cst@gmail.com"));
		
		//Collections.sort(st,new SortById());
		//Collections.sort(st,new SortByName());
		Collections.sort(st,new SortByEmail());
		
		Iterator<Employee> itr = st.iterator();
		while(itr.hasNext()) {
			Employee s = itr.next();
			s.display();
		}
	}
}
