package finalexampractice;

public class InterviewList {
	final int INIT_CAPACITY = 4;
	Applicant[] interviewees;
	int front = 0;
	int rear = 0;

	public InterviewList() {
		interviewees = new Applicant[INIT_CAPACITY];
	}

	void resize() {
		System.out.println("resizing...");
		Applicant newData[] = new Applicant[2 * interviewees.length];
		System.arraycopy(interviewees, 0, newData, 0, interviewees.length);
		this.interviewees = newData;
	}

	public void employeeAward(Applicant applicant) {
		if (rear == interviewees.length)
			resize();

		if (applicant.getExperience().contains("java"))
			interviewees[rear++] = applicant;
	}

	public Applicant awardToGive() {
		
		if(front > rear)
			return null;
		return interviewees[front++];
	}

	@Override
	public String toString() {
		String string = "";
		for (Applicant person : interviewees) {
			string += person.getName();
		}

		return string;
	}

	public int size() {
		if (front > rear)
			return 0;
		return rear - front;
	}

	public static void main(String[] args) {
		InterviewList iList = new InterviewList();

		iList.employeeAward(new Applicant("Rasel", "java"));
		iList.employeeAward(new Applicant("Safwan", "Java"));
		iList.employeeAward(new Applicant("Suha", "PHP"));
		iList.employeeAward(new Applicant("Rohan", "JavaScript"));
		iList.employeeAward(new Applicant("Asad", "ROR"));
		iList.employeeAward(new Applicant("Zaman", "Prothom"));
//		iList.employeeAward(new Applicant("Jewel", "ROR"));
		System.out.println(iList.size());
		System.out.println(iList.awardToGive().getName());
		System.out.println(iList.awardToGive());
		System.out.println(iList.awardToGive());
		System.out.println(iList.awardToGive());

		System.out.println(iList.size());
	}
}
