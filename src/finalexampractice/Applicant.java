package finalexampractice;

public class Applicant {
	private String name;
	private String experience; 
	public Applicant(String name ,String experience) {
		this.name = name;
		this.experience = experience;
	}
	
	public String getName() {
		return name;
	}
	
	public String getExperience() {
		return experience;
	}
}
