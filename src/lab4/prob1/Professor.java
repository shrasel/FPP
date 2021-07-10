package lab4.prob1;

import java.time.LocalDate;

public class Professor extends DeptEmployee {

	private int numberOfPublications;
	
	Professor(String name, double salary, LocalDate date) {
		super(name, salary, date);

	}

	public void setNumberOfPublications( int nop) {
		this.numberOfPublications = nop;
	}
	
	public int getNumberOfPublications() {
		return this.numberOfPublications;
	}
	

}
