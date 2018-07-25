package Generics;

public class Generics{
	
	public static void main(String args[]) {
		String names[] = {"vishu","chints","vihu"};
		Integer scores[] = {80,90,95};
		printArray(names);
		printArray(scores);

		}
	
	static <V extends Comparable <V>> void printArray(V[] array1) {
		for (int i=0; i<array1.length;i++) {
			System.out.println(array1[i]);
		}
		}
	}

