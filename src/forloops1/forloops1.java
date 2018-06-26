package forloops1;
import java.util.Scanner;

public class forloops1 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int firstnumber, lastnumber, increments;
		System.out.println("Enter the 1st number: ");
		firstnumber = sc.nextInt();
		System.out.println("Enter the final number: ");
		lastnumber = sc.nextInt();
		System.out.println("Enter the increments: ");
		increments = sc.nextInt();
		
		for (int i=firstnumber; i<= lastnumber; i+=increments) {
			System.out.println("\n" + i);
		}	
	}
}
