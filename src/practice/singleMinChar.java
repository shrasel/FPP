package practice;

public class singleMinChar {

	public static void main(String[] args) {
		char[] cr = { 'v', 'a','b', 'a', 'b' };
		System.out.println(checkMe(cr));
	}

	public static boolean checkMe(char[] chrAry) {

		if (chrAry.length == 0)
			return false;

		char minChar = chrAry[0];

		int count = 0;

		for (int i = 0; i < chrAry.length; i++) {

			if (chrAry[i] < minChar) {
				minChar = chrAry[i];
				count = 1;
			} else {
				if (chrAry[i] == minChar) {
					count++;
				}
			}
		}

		if (count > 1)
			return true;

		return false;
	}

}
