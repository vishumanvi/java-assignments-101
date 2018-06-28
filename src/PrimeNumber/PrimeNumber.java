package PrimeNumber;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int number;
		boolean isPrime = false;
		System.out.println("Enter any integer: ");
		number = sc.nextInt();
		isPrime = isPrime(number,2);
		if (isPrime == true) 
			System.out.println(number + " is a prime number");
		else
			System.out.println(number + " is NOT a prime number");
			
	}
	
	public static boolean isPrime(int number,int divisor) {
		if (number<=divisor)
			return true;
		else if (number%divisor == 0) {
			return false;
		} else {
				return(isPrime(number,divisor+1));
		}
	}
}
