package lab6.prob4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		new EmployeeSort();

	}

	public EmployeeSort() {

		Employee[] empArray = { new Employee("George", 40000, 1996, 11, 5), new Employee("Dave", 50000, 2000, 1, 3),
				new Employee("Richard", 45000, 2001, 2, 7) };

		System.out.println("Sort using Name Comparator");
		NameComparator nameComp = new NameComparator();

		Arrays.sort(empArray, nameComp);

		for (Employee e : empArray) {
			System.out.print(e);
		}
		System.out.println();

		System.out.println("Sort using Salary Comparator");
		SalaryComparator salComp = new SalaryComparator();
		Arrays.sort(empArray, salComp);
		for (Employee e : empArray) {
			System.out.print(e);
		}

		System.out.println();
		System.out.println("Sort using Hire date Comparator");
		HireDateComparator hdComp = new HireDateComparator();
		Arrays.sort(empArray, hdComp);

		for (Employee e : empArray) {
			System.out.print(e);
		}

		System.out.println();
//		System.out.println(Arrays.toString(empArray));

//		List<Employee> empList = Arrays.asList(empArray);
//		Collections.sort(empList, nameComp);		
//		System.out.println(empList);

	}

}
