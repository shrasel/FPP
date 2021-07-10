package lab4.prob1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Professor pf1 = new Professor("John Doe", 20220.00, LocalDate.of(2019, 12, 01));
		Professor pf2 = new Professor("Anne Morpy", 12880.00, LocalDate.of(2018, 01, 01));
		Professor pf3 = new Professor("John Doe", 23330.00, LocalDate.of(2021, 01, 01));

		pf1.setNumberOfPublications(10);
		pf2.setNumberOfPublications(10);
		pf3.setNumberOfPublications(10);

		Secretary sc1 = new Secretary("Saf Kong", 200000.00, LocalDate.of(2020, 01, 01));
		Secretary sc2 = new Secretary("Michel John", 220.00, LocalDate.of(2020, 01, 01));

		sc1.setOvertimeHours(200);
		sc2.setOvertimeHours(200);

		DeptEmployee[] departments = new DeptEmployee[5];

		departments[0] = pf1;
		departments[1] = pf2;
		departments[2] = pf3;
		departments[3] = sc1;
		departments[4] = sc2;

		Scanner scan = new Scanner(System.in);

		System.out.println("Want to see sum of all department Employee Salary? (y/n)");

		String ans = scan.nextLine();

		double total = 0.0;
		if (ans.equalsIgnoreCase("y")) {
			
			for(DeptEmployee employee:departments) {
//				System.out.println(employee.computeSalary());
				total+=employee.computeSalary();
			}
			
			System.out.println("Total Salary: $"+ total);

		}
		
		

	}

}
