package Anagram;

import java.util.*;


public class Anagram {
	public static void main(String args[]) {
		String a, b;
		boolean isAnagram = true;
		Scanner sc = new Scanner(System.in);

		try {
		System.out.println("Enter 1st string: ");
		a = sc.next();
		System.out.println("Enter 2st string: ");
		b = sc.next();
		isAnagram = isAnagram(a,b);
		if (isAnagram == true) {
				System.out.println(a + " and " + b + " are anagrams");
		} else {
				System.out.println(a + " and " + b + " are NOT anagrams");
		}
		} catch (Exception ex) {
			System.out.println("Caught exception");
		}
		finally {
			sc = null;
		}
	}
	
	static boolean isAnagram (String a, String b) {
		boolean isAnag = true;

		try { 	
			Character c;

			TreeMap <Character,Integer> StringA = new <Character,Integer> TreeMap();
			TreeMap <Character,Integer> StringB = new <Character,Integer> TreeMap();
	
			if (a.length() < 1 || a.length()>50 || b.length() < 1 || b.length()>50 || a.length() != b.length()) {
				isAnag = false;
			}
			
			for (int i=0; i<a.length();i++) {
				try {
					c = a.toLowerCase().charAt(i);
					if (StringA.containsKey(c)) {
						StringA.replace(c, StringA.get(c)+1);
					}
					else {
						StringA.put(c, 1);
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
				
			for (int i=0; i<b.length();i++) {
				try {
					c = b.toLowerCase().charAt(i);
					if (StringB.containsKey(c)) {
						StringB.put(c, StringB.get(c)+1);
					}
					else {
						StringB.put(c, 1);
					}
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
	
			if(StringA.size() != StringB.size()) isAnag = false;
			
					if (!StringA.equals(StringB)) {
						isAnag = false;
					}
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return isAnag;
		
	}
}