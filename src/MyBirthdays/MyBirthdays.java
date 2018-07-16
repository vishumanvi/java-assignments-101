package MyBirthdays;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MyBirthdays {

	public static void main(String args[]) {
		String birthDate;
		Calendar birthDayCalendar;
		GregorianCalendar gc = new GregorianCalendar();
		int birthDay,birthMonth, birthYear, birthDayIndex,birthMonthIndex;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter your birthdate (mm/dd/yyyy) format : ");
			birthDate = sc.next();
			birthDayIndex = birthDate.indexOf("/");
			birthMonth = Integer.parseInt(birthDate.substring(0, birthDayIndex));
			birthMonthIndex = birthDate.lastIndexOf("/");
			birthDay = Integer.parseInt(birthDate.substring(birthDayIndex+1,birthMonthIndex));
			birthYear = Integer.parseInt(birthDate.substring(birthMonthIndex+1));
			System.out.println("Your Birthdate is : " + birthMonth + birthDay + birthYear);
			birthDayCalendar = Calendar.getInstance();
			birthDayCalendar.set(birthYear,birthMonth,birthDay);
			
			switch(birthDayCalendar.get(Calendar.DAY_OF_WEEK)) {
			case 1:
				System.out.println("You were born on Sunday");
				break;
			case 2:
				System.out.println("You were born on Monday");
				break;
			case 3:
				System.out.println("You were born on Tuesday");
				break;
			case 4:
				System.out.println("You were born on Wednesday");
				break;
			case 5:
				System.out.println("You were born on Thursday");
				break;
			case 6:
				System.out.println("You were born on Friday");
				break;
			case 7:
				System.out.println("You were born on Saturday");
				break;
				
			}
		}
		catch (Exception ex) {
			System.out.println(ex.getStackTrace());
		}
		finally {
			sc = null;
		}
	}
} 
