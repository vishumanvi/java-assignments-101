package FindLargestNumber;

public class FindLargestNumber {
	public static void main(String args[]) {
		int []numbers;
		int largestnumber=0, position=0;
		numbers = new int[10];
		for (int i=0; i<10; i++) {
			numbers[i] = (int)(Math.random()*1000);
			System.out.println(numbers[i]);
			if (largestnumber <= numbers[i]) {
				largestnumber = numbers[i];
				position = i;
			}
		}
		System.out.println("Largest number is " + largestnumber + " and its position is " + (position+1));
	}
}