package lab10.prob1.employeebst;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
	// compareTo in this case is not consistent with equals
	public int compare(Employee e1, Employee e2) {
		Integer s1 = (int) e1.getSalary();
		Integer s2 = (int) e2.getSalary();
		return s1.compareTo(s2);
	}

}
