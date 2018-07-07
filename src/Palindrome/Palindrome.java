package Palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]) {
		String inputString;
		boolean isPalindrome = true, isValidString = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		inputString = sc.nextLine();
		if (inputString.length() > 50) {
			System.out.println ("String too long. Try again");
			isValidString = false;
		}
		else if (inputString.matches("[a-z]+[0-9]*") == false) {
				System.out.println("Try entering lower case string");
				isValidString = false;
		}
		if (isValidString == false) return;
		
		for (int i = 0; i< inputString.length()/2; i++) {
				if (inputString.charAt(i) != inputString.charAt(inputString.length()-i-1))
					isPalindrome = false;	
		}
		if (isPalindrome == true) 
			System.out.println("Entered string is a palindrome");
		else 
			System.out.println("Entered string is NOT a palindrome");	
	
		return;
	}
}
