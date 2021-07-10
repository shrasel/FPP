package lab2;

import java.util.Random;

/**
 *
 * @author Md Shahjahan Rasel
 * 
 *  Create a class called Prog2. In the main method of the class, output to the console the result of doing the following two computations:
	1. get a random number x in the range 1 .. 9 and compute π
	2. get a random number y in the range 3 .. 14 and compute y .
	Use the RandomNumbers.java class that has been provided for you. (Do not use the Random class directly.)
 *
 */
public class prog2 {
	
	static Random random;

	private prog2() {
		random = new Random();
	}

	public static void main(String[] args) {

		int rand1 = getRandomInt(1, 9);
		int rand2 = getRandomInt(3, 14);
		double pi = Math.PI;
		System.out.println("Value of π = " + pi);
		System.out.println(
				"Random number x = " + rand1 + " in the range 1 .. 9 and computed πx is : " + Math.pow(pi, rand1));
		System.out.println("Random number y = " + rand2 + " in the range 3 .. 14 and computed yπ is : "
				+ Math.pow(rand2, pi));
	}

	/**
	 * Use this method to get a random integer, with a call like this: int myInt =
	 * Prog1.getRandomInt();
	 */
	public static int getRandomInt() {
		if (random == null)
			new prog2();
		return random.nextInt();
	}

	/**
	 * Returns a random integer x satisfying lower <= x <= upper. If lower > upper,
	 * returns 0.
	 * 
	 * @param lower
	 * @param upper
	 * @return
	 */
	public static int getRandomInt(int lower, int upper) {
		if (lower > upper)
			return 0;
		if (lower == upper)
			return lower;
		int difference = upper - lower;
		int start = getRandomInt();

		// non negative integer in the range 0..difference - 1
		start = Math.abs(start) % (difference + 1);

		start += lower;
		return start;
	}


}
