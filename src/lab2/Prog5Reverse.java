package lab2;

import java.util.Scanner;

public class Prog5Reverse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write something and see the reverse order:");
		
		String input = sc.nextLine();
		
		System.out.print("Output: " );
		sc.close();
		
		for(int i=input.length()-1; i>=0; i--) {
			System.out.print(input.charAt(i));
		}
		

	}

}
