package arrays1;

public class arrays1 {

	public static void main(String args[]) {
		int []numbers;
		numbers = new int[1000];
		for (int i=0; i<1000; i++) {
			do {
				numbers[i]= (int)((Math.random()*1000)%100);
			} while (numbers[i] < 10);
			
			if (i%20 == 0)
				System.out.print("\n");
			System.out.print(numbers[i] + " ");
		}
		test();
	}
	public static void test() {
		System.out.println("TEST");
	}
}
