package lab7.prob1;

public class Exponential {
	public double power(double x, int n) { // implement
		if (n <= 0) return 1;

		return x * power(x, n-1);
	}

	public static void main(String[] args) {
		Exponential e = new Exponential();
		
		System.out.println(e.power(2, -2));
		System.out.println(Math.pow(2, 10));
	}
}
