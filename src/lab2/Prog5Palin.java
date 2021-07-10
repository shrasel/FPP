package lab2;

import java.util.Scanner;

public class Prog5Palin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Is Palindrome? ");
		
		String input = sc.nextLine();
		
		sc.close();
		
		int i = 0, j = input.length()-1;
		
		while(i<j) {
			
			if(input.charAt(i)!=input.charAt(j)) {
				System.out.println("This is not a palindrome");
				return;
			}
			
			i++;
			j--;
				
		}
		
		System.out.println("This is a palindrome");
		

	}

}
