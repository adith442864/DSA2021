package Recursions;

public class RecursionSumOfNaturalNumber {
	
	static int getsum(int n) {
		
		if(n==0) 
			return 0;
			
			return getsum(n-1)+n;
		}

	public static void main(String[] args) {
		
		int n=4;
		System.out.println(getsum(n));
		
		}
		
	}

// time complexity: T(n) = T(n-1) + T(1)

/*logic:
 * 	getsum(4) -> 10
 * 		4+getsum(3) -> 10
 * 			3+getsum(2) -> 6
 * 				2+getsum(1) -> 3
 * 					1+getsum(0) -> 0+1
 * 
 * 
 * 
 */
