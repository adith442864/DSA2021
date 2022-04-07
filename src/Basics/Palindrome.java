package Basics;

public class Palindrome {
	
	/*
	 * 
	 */
	
	static boolean isPal(int n) {
		
		int rev=0; //initially set to 0
		int temp=n; //8668
		
		while(temp!= 0) {
			int ld=temp%10; //eliminate the last digit
			rev=rev*10+ld;
			temp=temp/10; 
		}
		
		return(rev==n);
		
	}

	public static void main(String[] args) {
		
		int n=363; //3554
		System.out.println(isPal(n));
		
		// time complexity: θ(d)
		
		/**
		 * n = 4553, rev=0, temp=n
		 * 
		 * iteration 3:
		 * ld= n%10 -> 4553%10 = 455 Remainder = 3
		 * rev = rev*10+3 -> 3
		 * temp=temp/10 -> eliminate last digit 3
		 
		 * 
		 * iteration: 5
		 * ld = temp%10 -> 455%10 = 45, Remainder = 5
		 * rev=rev*10+5 => 45*10+5 = 455
		 * temp=temp/10 -> eliminate last digit 5 ->45
		 * 
		 * iteration: 5
		 * ld = n%10 -> 45%10 = 4, Remainder =5
		 * rev = 4*10+5 = 45
		 * temp = temp/10 -> 5 will be eliminated.
		 * 
		 * 
		 * 
		 * iteration: 4
		 * ld = 5, rev=
		 * 
		 */
	}

}
