package BitSetDemo;

import java.util.*;

public class BitSetDemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n,m, op1,op2;
		String operator;
		try {
			System.out.println("Enter value of N and M :");
			n = (int)sc.nextInt();
			m = (int)sc.nextInt();
			BitSet b1 = new BitSet(n);
			BitSet b2 = new BitSet(n);
			b1.set(0, n, false);
			b2.set(0, n, false);
//			b2.clear();
			for (int i=0; i<m;i++) {
				operator = sc.next();
				op1 = sc.nextInt();
				op2 = sc.nextInt();
				switch (operator) {
				case "AND":
						if (op1 == 1) b1.and(b2);
						else b2.and(b1);
						break;
						
				case "OR":
					if (op1 == 1) b1.or(b2);
					else b2.or(b1);
					break;

				case "XOR":
					if (op1 == 1) b1.xor(b2);
					else b2.xor(b1);
					break;
					
				case "FLIP":
					if (op1 == 1) b1.flip(op2);
					else b2.flip(op2);
					break;
					
				case "SET":
					if (op1 == 1) b1.set(op2);
					else b2.set(op2);
					break;
				}
				System.out.print(b1);
				System.out.print(" ");
				System.out.println(b2);
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
