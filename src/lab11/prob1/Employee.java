package lab11.prob1;

import java.util.Collection;
import java.util.HashMap;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap<String, Double> salaryRecord;

	public Employee() {
		this.salaryRecord = new HashMap<String, Double>();
	}

	public void addEntry(String date, double salary) {
		// implement
		salaryRecord.put(date, salary);
	}

	public void printPaymentAmount(String date) {
		// implement
		if (date == null) {
			return;
		}
		if (salaryRecord.containsKey(date)) {
			System.out.println(this.getFirstName() + " " + this.getLastName() + " was paid " + salaryRecord.get(date)
					+ " on " + date);
		} else {
			System.out.println(
					this.getFirstName() + " " + this.getLastName() + " did not recieved a paycheck on " + date);
		}

	}

	public void printAveragePaycheck() {
		// implement
		double sum = 0.00;
		double size = salaryRecord.size();
		Collection<Double> salaries = salaryRecord.values();
		for (Double salary : salaries) {
			sum += salary;
		}
		double averagePaycheck = sum / size;
		System.out.println("Average paycheck for " + getFirstName() + " " + getLastName() + " was " + averagePaycheck);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Safwan");
		e.setLastName("Ruwayfi");
		for (int i = 1; i <= 12; ++i) {
			e.addEntry(i + "/15/2011", 3070 + 5 * i);
		}
		e.printPaymentAmount("3/15/2021");
		e.printPaymentAmount("5/15/2020");
		e.printAveragePaycheck();

	}

}
