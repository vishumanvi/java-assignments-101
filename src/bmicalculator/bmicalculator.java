package bmicalculator;

import java.util.Scanner;

public class bmicalculator {
	public static void main(String args[]) {
		float weight, height, bmivalue;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your weight in kgs: ");
		weight = sc.nextFloat();
		System.out.print("Enter your height in meters: ");
		height = sc.nextFloat();
		bmivalue = weight/(height*height);
		System.out.println("\nYour BMI is " + bmivalue);
	}

}
