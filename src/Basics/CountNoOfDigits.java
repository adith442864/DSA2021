package Basics;

public class CountNoOfDigits {
	
	
	static int countDigits(int n) {
		
		int res=0;
		
		while(n>0) {
			n=n/10;
			res++;
		}
		
		return res;
	}
	
	/*
	 *  x= 789
	 *  initially: res =0;
	 *  
	 *  After 1st Iteration:
	 *  x=78;
	 *  res=1
	 *  
	 *  After second iteration:
	 *  x=7
	 *  res=2
	 *  
	 *  After third iteration:
	 *  x=0;
	 *  res=3;
	 *  break;
	 *  Time Complexity : Theta(d)
	 *  
	 */
	
	public static void main(String args[]) {
		
		int n=10;
		System.out.println(countDigits(n));
		
	}

}
