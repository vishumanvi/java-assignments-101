package ParallelArrays;

import java.util.Scanner;

public class ParallelArrays {
	public static void main(String args[]) {
		int noofStudents, sortPreference, tempMarks;
		String tempName;
		Scanner sc = new Scanner(System.in);
		try {
			
		System.out.println("How many students are you entering the data for? :");
		noofStudents = sc.nextInt();
		String studentNames[] = new String[noofStudents];
		int studentMarks[] = new int[noofStudents];
		for (int i=0; i<noofStudents;i++) {
			System.out.println("Enter student name : ");
			studentNames[i] = sc.next();
			System.out.println("Enter marks for " + studentNames[i] + ": ");
			studentMarks[i] = sc.nextInt();
		}
		System.out.println("Press 1. To sort by names and 2. To sort by marks");	
		sortPreference = sc.nextInt();
		switch (sortPreference)
		{
		case 1:
			for (int i=0; i< noofStudents; i++) {
				for (int j=i+1; j<noofStudents;j++) {
					if (studentNames[i].compareToIgnoreCase(studentNames[j]) > 0) {
						tempName = studentNames[j];
						tempMarks = studentMarks[j];
						studentNames[j] = studentNames[i];
						studentMarks[j] = studentMarks[i];
						studentNames[i] = tempName;
						studentMarks[i] = tempMarks;
					}
				}
			}
			break;
		case 2:
			for (int i=0; i< noofStudents; i++) {
				for (int j=i+1; j<noofStudents;j++) {
					if (studentMarks[i] > studentMarks[j]) {
						tempName = studentNames[j];
						tempMarks = studentMarks[j];
						studentNames[j] = studentNames[i];
						studentMarks[j] = studentMarks[i];
						studentNames[i] = tempName;
						studentMarks[i] = tempMarks;
					}
				}
			}
		}
			System.out.println("Sorted list by name is ");
			for (int i=0; i< noofStudents; i++) {
				System.out.println("Student " + studentNames[i] + " scored " + studentMarks[i]);
			}
				
		}
	catch (Exception ex) {
	}
	finally {
		sc = null;
	}
 }
}
