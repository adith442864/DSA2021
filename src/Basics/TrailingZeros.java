package Basics;

public class TrailingZeros {
	
	static int trailingZeros(int n) {
		
		int fact=1;
		for(int i=2; i<=n; i++) 
			fact=fact*i;
			
			int res=0;
			
			while(fact%10==0) {
				res++; // if it is divisible by 10, increment the res counter..
				fact=fact/10;
			}
			
			return res;
		}
		

	public static void main(String[] args) {
		
		int n=10;
		System.out.println(trailingZeros(n));

	}

}

//time complexity : θ(n)
// issue: cause overflow issues