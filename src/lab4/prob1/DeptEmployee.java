package lab4.prob1;

import java.time.LocalDate;

public class DeptEmployee {
	
	String name;
	double salary;
	LocalDate hireDate;
	
	DeptEmployee(String name, double salary, LocalDate date){
		this.name = name;
		this.salary = salary;
		this.hireDate = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	public double computeSalary() {
		return salary;
	}
	

}
