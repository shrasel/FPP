package lab4.prob1;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
	
	private double overtimeHours = 0.0;

	Secretary(String name, double salary, LocalDate date) {
		super(name, salary, date);
	}
	
	public void setOvertimeHours(double hrs) {
		this.overtimeHours = hrs;
	}
	
	public double getOvertimeHours() {
		return overtimeHours;
	}
	
	@Override
	public double computeSalary() {
		return salary + 12 * overtimeHours;
	}
	
	
}
