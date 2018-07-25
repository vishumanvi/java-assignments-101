package Collections;
import java.util.*;

public class HashMapExample {
 public static void main(String args[]) {
 try { 
	HashMap <Integer, String> names = new <Integer, String> HashMap();
	names.put(100, "Vishu");
	names.put(4, "vihu");
	names.put(8,"Chints");
	
	TreeMap <Integer,Integer> numbers = new <Integer,Integer> TreeMap();
	
	numbers.put(1, 2);
	numbers.put(7, 100);
	numbers.put(3, 100000);
	numbers.put(2, 0);
	if (numbers.containsValue(20) == true)
		System.out.println("Found 100");
	
	for (int i=0;i<=numbers.size(); i++) {
		System.out.println("Numbers in Treemap are "+ numbers.get(i));

	}
	int lastNumber = numbers.get(1);
	System.out.println("Last number is "+ lastNumber);
	
	String value1 = names.get(8);
	String value2 = names.get(4);
	
	System.out.println("Value 1 = " + value1);
	System.out.println("Value 2 = " + value2);
	
	} catch(Exception ex) { 
		 System.out.println("Caught exception");
		 ex.printStackTrace();
	  }
 }
}
