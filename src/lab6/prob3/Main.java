package lab6.prob3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] names = {"Safwan", "Elisa", "Honhon", "John","Jewel","Tareq"};

		StringSort ss = new StringSort(new StringLengthComparator());
		ss.stringSort(names);

		System.out.println(Arrays.toString(names));

	}

}
