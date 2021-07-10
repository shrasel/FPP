package practice;

public class numOfBlocks {

	public static int countBlocks(int blockNum) {
		if (blockNum <= 0)
			return 0;

		return blockNum + countBlocks(blockNum - 1);

	}

	public static int countChar(String s) {
		if (s.length() <= 0)
			return 0;

		if (s.charAt(0) != ' ')
			return 1 + countChar(s.substring(1));

		return countChar(s.substring(1));
	}

	public static int count_the(String s) {
		if (s.length() < 3 ) return 0;

		if (s.substring(0, 3).equals("the")) {
			return 1 + count_the(s.substring(3));
		}

		return count_the(s.substring(1));
	}

	public static void main(String[] s) {
		System.out.println(count_the("count me me me the the come to"));
	}

}
