package arrays1;

import java.util.*;
import java.util.StringTokenizer;
import java.io.*;

public class subarrays {
	public static void main(String args[]) {
		int n, mainArray[], i=0, element;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n<1 || n >100) {
			System.out.println("Validation error");
			return;
		}
		mainArray = new int[n];
		while (i<n) {
			element = sc.nextInt();
			if (element < -10000 || element > 10000) {
				System.out.println("Validation error");
				return;
			} else {
				mainArray[i++] = element;
			}
			
		}
		int sum, negativeCounts = 0;
		for (int j = 0; j<mainArray.length; j++) {
			sum = mainArray[j];
			if (sum < 0) negativeCounts++;
			for (int k = j+1; k<mainArray.length; k++) {
				 sum+=mainArray[k];
				 if (sum < 0) negativeCounts++;
			}
		}
		System.out.println(negativeCounts);
	}
}
