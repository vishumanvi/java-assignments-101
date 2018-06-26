package dicegame;

public class dicegame {
	public static void main(String args[]) {
		int dice1, dice2;
		do {
			dice1 = (int)((Math.random()*10000)%6);

		} while(dice1 == 0);
		
		do {
			dice2 = (int)((Math.random()*10000)%6);
		} while (dice2 == 0);
		
		System.out.println("Dice 1 is " + dice1);
		System.out.println("Dice 2 is " + dice2);

	}

}
