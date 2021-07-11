package lab11.prob4;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class AttendanceRecord {
	HashMap<String, Double> hStudentRec = new HashMap<String, Double>();
	Double zero = Double.valueOf(0);

	AttendanceRecord() {
		this.hStudentRec = new HashMap<String, Double>();
	}

	void addAttendance(String studentID, double numDays) {
		// Implement
		if (hStudentRec.get(studentID) != null) {
			hStudentRec.put(studentID, numDays + hStudentRec.get(studentID));
		} else {
			hStudentRec.put(studentID, numDays);
		}

	}

	void printAttendance() {
		// Implement

		Collection<String> ids = hStudentRec.keySet();
		Iterator<String> idIter = ids.iterator();

		while (idIter.hasNext()) {
			String id = idIter.next();
			System.out.println("Attendance for student ID " + id + " is " + hStudentRec.get(id));
		}

	}

	public static void main(String[] args) {
		String[][] attendance = { 
				{ "21212", "12345", "21212", "98765", "24321", "21212", "52000" },
				{ "12345", "16789", "24321", "21212", "12345", "16789", "52000" }, 
				{ "76253", "98765", "52000" } 
			};

		AttendanceRecord attendRec = new AttendanceRecord();
		for (int i = 0; i < attendance.length; ++i) {
			for (int j = 0; j < attendance[i].length; ++j)
				attendRec.addAttendance(attendance[i][j], 1);
		}
		attendRec.printAttendance();
	}
}
