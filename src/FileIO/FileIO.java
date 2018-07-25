package FileIO; 
import java.io.*;
import java.util.*;

enum Days {
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

public class FileIO {
	public static void main(String args[]) {
		File fil = new File("/Users/vishu/git/java-assignments-101/src/Vihaan.txt");
		FileInputStream fin = null;
		int i,vihaanWordCount=0;
		char c;
		try {
			ArrayList <String> words = new ArrayList<String>();
			StringBuffer newWord = new StringBuffer(1);
			if (fil.exists() == false) {
				System.out.println("File not found! ");
			}
			
			fin = new FileInputStream(fil);
			do {
				i = fin.read();
				c = (char)i;
				if (c == ' ' | c == '.'| c == ',' | c == '!'| c == '\n') {
					words.add(newWord.toString());
					newWord.delete(0, newWord.length());
				}
				else {

					newWord = newWord.append(c);
				}		
			} while (i !=-1);
				
			for (String s: words) {
				/*
				if (s == Days.MONDAY) {
					System.out.println("It's a Monday!");
				}
				*/
				if (s.equals("boy")) {
					vihaanWordCount++;
				}
			}
			System.out.println("Word present " + vihaanWordCount + " times.");
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			fil = null;
			try {
			if (fin != null) {
				fin.close();
			}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			}
		}
	}

