package LittleQuiz;

import java.util.Scanner;

public class LittleQuiz {

	public static void main(String args[]) {
		System.out.println("Welcome to Vish Trivia! Answer all 3 questions correctly to win bumper prize");
		beginQuiz();
	}
	
	public static void beginQuiz() {
		Scanner sc = new Scanner(System.in);
		int answer1, answer2, answer3, score = 0;
		int correctanswer1, correctanswer2, correctanswer3;
		correctanswer1=1;
		correctanswer2=2;
		correctanswer3=2;
		System.out.println("Q1. How many moves do a horse make in chess? \n 1.Two and half \n 2.Two \n 3.One \n");
		answer1 = sc.nextInt();
		System.out.println("Q2. Which is the fastest car in the world? \n 1.Lamborgini \n 2.Koeineggs Agera \n 3. Buggati Veyron \n");
		answer2 = sc.nextInt();
		System.out.println("Q3. What's your school name? \n 1.Stratford \n 2. Devargas \n 3. St. Alosysios \n");
		answer3 = sc.nextInt();
		if (answer1 == correctanswer1)
			score+=100;
		if (answer2 == correctanswer2)
			score+=100;
		if (answer3 == correctanswer3)
			score+=100;
		System.out.println("You scored " + score + "\n");
		if (score == 300)
			System.out.println("Congratulations! You won the quiz! Hurray");		

	}
}

		