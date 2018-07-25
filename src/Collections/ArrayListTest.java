package Collections;

import java.util.*;


public class ArrayListTest {
	public static void main(String args[]) {
	ArrayList<String> names = new ArrayList<String>();
	names.add("vishu");
	names.add("chints");
	names.add("vihu");
	System.out.println("Size of array is : "+ names.size());
	names.sort(null);
	
	LinkedList <String> addresses = new <String> LinkedList();
	addresses.add("san tomas");
	addresses.addFirst("norwalk dr");
	addresses.addLast("el camino real");
	addresses.getFirst();
	addresses.addFirst("moorpark road");
	addresses.remove();
	
	for (String s : names) {
		System.out.println("Element is : " + s);
	}
	for (String a : addresses) {
		System.out.println("Addresses are : " + a);
	}
	
	LinkedList <Integer> numbers = new <Integer> LinkedList();
	numbers.add(1);
	numbers.add(100);
	numbers.add(10);
	numbers.add(9);
	numbers.add(0);
	
	for (String s : names) {
		System.out.println("Element is : " + s);
	}
	for (String a : addresses) {
		System.out.println("Addresses are : " + a);
	}
	for (Integer i : numbers) {
		System.out.println("Integers are : " + i);
	}

 }
}
