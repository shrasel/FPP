package finalexampractice;

import java.util.Hashtable;

public class Prob6 {

	Hashtable<Integer, Double> salaries = new Hashtable<>();
	Double[][] arrSalaries;
	static Integer[] ids = { 1, 2, 3, 4, 5, 6, 7 };

	public Prob6(int numEmployees) {
		arrSalaries = new Double[numEmployees][12];
	}

	public Hashtable<Integer, Double> addSalaries(Integer[] ids, double arrSalaries[][]) {
		for (int i = 0; i < arrSalaries.length; i++) {
			double sum = 0;
			for (int j = 0; j < arrSalaries[i].length; j++) {
				sum += arrSalaries[i][j];
			}
			salaries.put(ids[i], sum);
		}

		return salaries;
	}

	public static void main(String[] args) {
		
		Prob6 emProb6 = new Prob6(ids.length);
		
		double [][] salaries = {
				{122.0,121.2,2313.0},
				{122.0,121.2,2313.0}
		};
		Hashtable<Integer, Double> hashtable = emProb6.addSalaries(ids,salaries);
		
		System.out.println(hashtable);
	}

}
