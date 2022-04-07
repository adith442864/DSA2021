package Basics;

public class TrailingZerosMethod2 {
	
	static int countTrailingzero(int n) {
		
		int res=0;
		
		for(int i=5; i<=n; i=i*5)
			res=res+n/i; // dividing the given number with multiples of 5. 
			// 251/5 = 50, res=50 and iteration 2 : 251/25 = 10, res=60
		return res;
	}

	public static void main(String[] args) {
		
		int n=10;
		System.out.println(countTrailingzero(n));

		
	}

}


// n/i = res;
// formula: n/5 + n/25 + n/125..... not overflowing...
//time comlexity : θ(logn)