package lab7.pencil;

public class test1 {
	public static void main(String[] args) {
		new test1();
	}

	test1() {
		recurse("Hello");
	}

	String recurse(String s) {
		if (s == null)
			return null;
		int r = 6;
		int n = s.length();
		if (r % 2 == 0)
			return recurse(s.substring(0, n / 2));
		else {
			return recurse(s.substring(n / 2, n));
		}
	}
}
