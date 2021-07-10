package lab2;

/**
 * Create a class Prog3. Inside its main method, create float variables to store each of the following numbers:
1.27, 3.881, 9.6
Output to the console the following two values:
1. the sum of the floats as an integer, obtained by casting the sum to type int
2. the sum of the floats as an integer, obtained by rounding the sum to the nearest
integer, using the Math.round function

 * @author Md Shahjahan Rasel
 *
 */

public class prog3 {

	public static void main(String[] args) {
		
		float var1 = 1.27f;
		float var2 = 3.881f;
		float var3 = 9.6f;
		
		float sumoffloat = var1+var2+var3;
		
		int sum = (int)sumoffloat;
		
		int msum = Math.round(sumoffloat);
		
		System.out.println("Sum of the floats as an integer, obtained by casting the sum to type int: "+sum);
		
		System.out.println("Sum of the floats as an integer(using the Math.round function): "+msum);
		

	}

}
