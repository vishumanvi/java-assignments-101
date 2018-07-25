package Collections;

import java.util.*;

public class TreeSetTest {
 public static void main(String args[]) {
	 TreeSet <Integer> numbers = new <Integer> TreeSet();
	 numbers.add(100);
	 numbers.add(2);
	 numbers.add(999);
	 numbers.add(100000);
	 numbers.add(0);
	 numbers.add(7);
	 int num2 = numbers.last();
	 System.out.println("Last Num is " + num2);
		 
	 for (int num : numbers) {
		 System.out.println("Number is : " + num);
	 }
	 
 }
}
