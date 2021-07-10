package lab2;
/**
 * 
 * @author Md Shahjahan Rasel
 * 
 */

public class pencilpaper {
	
	public static void main(String[] args) {
		// Using Java ternary operator
		int age = 45;
		String socialSecurityStatus = (age > 65) ?   "eligible" : "ineligible";
		
		System.out.println("Age "+age +" is " +socialSecurityStatus);
		
		System.out.println("===================");
		
		String s = "a friendly face";
		
		System.out.println("Compute the value of the expression s.charAt(2) Ans: "+s.charAt(2));
		System.out.println("What is the value of s.length()? Ans: " + s.length());
		System.out.println("What is the value of s.substring(4)? Ans: " + s.substring(4));
		System.out.println("What is the value of s.substring(2,9)? Ans: " + s.substring(2,9));
		
		System.out.println("===================");
		
		/**
		 * Given the radius r of a circle, compute the area of the circle, and store it in a
		 * a Java expression that computes each of the following: variable A.
		 */
		
		
		int radious = 13; 
		
		double A = Math.pow(radious, 2) * Math.PI;
		
		System.out.println("Area of the Circle: " + A);
		
		System.out.println("===================");
		
		/**
		 * Given the length len and width wid of a rectangle, compute the length of the 
		 * diagonal of the rectangle, and store it in a variable diag.
		 */
		
		
		double len = 20;
		double wid = 14.45;
		
		double diag = 0;
		
		diag = Math.sqrt(Math.pow(len, 2) + Math.pow(wid, 2)); 
		
		System.out.println("Length of the diagonal of the rectangle: " + diag);
		
		System.out.println("===================");
		
		
		/**
		 * 4. Compute the following (without writing any Java code) and indicate the type of your
		 * answer. (Example: 4 * 3 + 2 equals 14, of type int.)
		 * 		a. 3 * 5 / 9 % 2
		 * 		b. 3 == 4 && true
		 * 		c. 13 % 2 + 2 * 4
		 * 		d. 15 > 20 ? 32 : 2+5
		 */
		
		System.out.println("a. 3 * 5 / 9 % 2 = "+ 3 * 5 / 9 % 2); 
		System.out.println("b. 3 == 4 && true = "+ (3 == 4 && true)); 
		System.out.println("c. 13 % 2 + 2 * 4 = "+ 13 % 2 + 2 * 4); 
		System.out.println("d. 15 > 20 ? 32 : 2+5 = "+ ((15 > 20) ? 32 : 2+5));
		
		
		System.out.println("===================");
		
		int b;
		int a = (b = 5);
		
		System.out.println(a);

		
	}

}
