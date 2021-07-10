package lab7.prob3;

public class NumOfChar {

	public static int countChars(String s) {
		if (s.length() == 0)
			return 0;
		if (s.charAt(0) != ' ')
			return 1 + countChars(s.substring(1));

		return countChars(s.substring(1));
	}

	public static void main(String[] s) {
		
		String st = "c oco oc o";

		System.out.println("Number of char in the string: " + countChars(st));
	}

}
