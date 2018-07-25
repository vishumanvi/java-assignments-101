package LambdaExpressions;

interface MyLambada <T> {
	T function (T i);	
}

public class LambdaExpression {
	public static void main(String args[]) {
		MyLambada <Integer> myLamb;
		myLamb = (n) -> (n*2);
		System.out.println("Lambada expression 1 is : " + myLamb.function(5));
		MyLambada <String> myLamb2;

		myLamb2 = (str) -> {
					String newStr = "";
					for (int j=str.length()-1;j>=0;j--) {
						newStr = newStr + str.charAt(j);
					}
					return newStr;
		};
		System.out.println("Lambada expression 2 is : " + myLamb2.function("Vishwanath"));

	}

}
