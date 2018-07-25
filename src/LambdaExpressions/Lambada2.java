package LambdaExpressions;

interface PerformOperation {
	boolean check(int a);
}

class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }
 
//Write your code here
public static PerformOperation isOdd() {
  PerformOperation checkOdd; 
  checkOdd = (num) -> (num%2 != 0);
  return checkOdd ;
}

public static PerformOperation isPrime() {
  PerformOperation checkPrime; 
  checkPrime = (num) -> {
	  						boolean isP = true;
                        	for (int i=2;i<num;i++) {
                        	  if (num%i == 0)
                        		  isP = false;
                          }    
                        	return isP;
  						};

  return checkPrime;
  }

public static PerformOperation isPalindrome() {
	  PerformOperation checkPalindrome; 
	  checkPalindrome = (num) -> {
		  							boolean isPalindrome = false;
	                          		int revnum = 0, originalnum, remainder;
	                          		originalnum = num;
	                          		while (originalnum>0) {
	                          			remainder = originalnum%10;
	                          			revnum = revnum * 10 + remainder;
	                          			originalnum = originalnum/10;	                          			
	                          		}
	                          		if (revnum == num) {
	                          			isPalindrome = true;
	                          		}
	                          		return isPalindrome;                  
	  							};
	  	return checkPalindrome;
	  
	  }
}
  