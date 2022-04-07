package Recursions;

public class RecursionSumOfDigits {
	
	/*
	 * Logic:
	 * 	n/10 -> gives last digit of
	 * 	n%10 -> removes the last digit of n
	 * 
	 *  n = 253
	 *  n%10 -> 253/10 = 25 + 3
	 *  
	 *  n25
	 *  n%10 -> 25/10 = 2 + 5
	 *  
	 *  n=2
	 *  n%10 = 2%10 = 2 
	 *  
	 *  output : 2+5+3 = 10
	 *  
	 *  
	 */
	
	// logic :use n/10 -> remove last digit. n%10 will divide the number/2..
	
	static int sumOfDigits(int n) {
		
		if(n==0)
			return 0;
		
		return sumOfDigits(n/10) + n%10; //253 --> sum(25)+3...sum(2)+5...sum(0+2)....
		
	}
	
	// Iterative solution:
	
		static int sumOfDigitsIterative(int n) {
			
			int res =0;
			while(n>0) {
				res = res + n%10;
				n=n/10;
				
				//return res;
			}
			return res;
			
			
		}
	

	public static void main(String[] args) {
		
		System.out.println(sumOfDigits(253));
		
		System.out.println(sumOfDigitsIterative(253));
	}

}

// time complexity : T(d)
