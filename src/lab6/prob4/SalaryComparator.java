package lab6.prob4;

import java.util.Comparator;
import java.util.Date;

public class SalaryComparator implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		String e1_name = e1.getName();
		String e2_name = e2.getName();
		Date e1_hireDate = e1.getHireDate();
		Date e2_hireDate = e2.getHireDate();
		int e1_salary = e1.getSalary();
		int e2_salary = e2.getSalary();
		if (e1_salary != e2_salary) {
			if (e1_salary < e2_salary)
				return -1;
			else
				return 1;
		}

		// e1_salary equals e2_salary
		if (e1.getName().compareTo(e2.getName()) != 0) {
			return e1.getName().compareTo(e2.getName());
		}

		// salary1 equals salary2 and name1 equals name2
		return e1_hireDate.compareTo(e2_hireDate);
	}
}
