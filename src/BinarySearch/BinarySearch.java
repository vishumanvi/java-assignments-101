package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String args[]) {
		int searchNumber, position, tempNumber, midPoint, uLimit, lLimit;
		int [] numbers = {100,20,50,25,40,60,80,90,56,86,102,23};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to search : ");
		searchNumber = sc.nextInt();
		for (int i=0; i< numbers.length; i++) {
			for (int j=i+1; j< numbers.length;j++) {
				if (numbers[i] > numbers[j]) {
					tempNumber = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = tempNumber;
				}
			}
		}
	uLimit  = numbers.length;
	lLimit = 0;
	midPoint = (uLimit-lLimit)/2;
	
	position = binarySearch(numbers, searchNumber,uLimit,lLimit,midPoint);
	if (position == -1)	{
		System.out.println("Number not found");
	} else {
	System.out.println("Found number at position : " + (position+1));
	}
}

public static int binarySearch(int []numbers, int searchNumber,int uLimit, int lLimit, int midPoint) {
	try {
		
	if (searchNumber == numbers[midPoint]) {
			return midPoint;
	} else if (lLimit == midPoint || uLimit == midPoint)
		return -1;
	else if (searchNumber > numbers[midPoint]) {
				lLimit = midPoint;
				midPoint = (int) (midPoint + (int)Math.round(uLimit-lLimit)/2.0);
				midPoint = binarySearch(numbers, searchNumber,uLimit, lLimit, midPoint);
	} else if(searchNumber < numbers[midPoint]) {
				uLimit = midPoint;
				midPoint = (int) (midPoint - (int)Math.round(uLimit-lLimit)/2.0);
				midPoint = binarySearch(numbers, searchNumber,uLimit, lLimit, midPoint);
			}
	return midPoint;
	}
	catch (Exception ex) {
			System.out.println("Caught exception");
			return midPoint;
	}

 }
}
