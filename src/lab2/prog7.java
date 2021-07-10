package lab2;

import java.util.Random;

/**
 * 
 * @author Md Shahjahan Rasel
 * @ID 612395
 */
public class prog7 {

	public static void main(String[] args) {
		
		String output = "";
		output = String.format("%16d %10d %10d  %9d %n %n %n %n", RandomNumber.getRandomInt(1, 99), RandomNumber.getRandomInt(1, 99), RandomNumber.getRandomInt(1, 99),RandomNumber.getRandomInt(1, 99));
		output += String.format("%13s %2d %7s %2d %7s %2d %7s %d %n","+", RandomNumber.getRandomInt(1, 99), "+", RandomNumber.getRandomInt(1, 99) , "+" ,RandomNumber.getRandomInt(1, 99), "+", RandomNumber.getRandomInt(1, 99));
		output += String.format("%16s %10s %10s %10s","____", "____",  "____" ,  "____");
		
		output +="\n\n";
		output +="\n\n";
		output +="\n\n";
		output += String.format("%16d %10d %10d  %9d %n %n %n %n", RandomNumber.getRandomInt(1, 99), RandomNumber.getRandomInt(1, 99), RandomNumber.getRandomInt(1, 99),RandomNumber.getRandomInt(1, 99));
		output += String.format("%13s %2d %7s %2d %7s %2d %7s %d %n","+", RandomNumber.getRandomInt(1, 99), "+", RandomNumber.getRandomInt(1, 99) , "+" ,RandomNumber.getRandomInt(1, 99), "+", RandomNumber.getRandomInt(1, 99));
		output += String.format("%16s %10s %10s %10s","____", "____",  "____" ,  "____");
		
		System.out.println(output);

	}

}
