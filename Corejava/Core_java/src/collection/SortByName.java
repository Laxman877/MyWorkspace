package collection;

import java.util.Comparator;

public class SortByName implements Comparator<Employee>{
	public int compare(Employee o1, Employee o2) {
		String name1 = o1.name;
		String name2 = o2.name;
		
		return -name1.compareTo(name2);
	}

}
