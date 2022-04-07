package Recursions;

/*
 * 0+1=1
 * 1+1=2
 * 1+2=3
 * 2+3=5
 * 3+5=8
 * 5+8=13
 * 13+
 */

public class FibonacciRecursion {
	
	static int fib(int n) {
		
		if(n<=1)
			return n;
		
		return fib(n-1)+fib(n-2); // 8+7, 
		// 1st Iteration:
		// 
		
	}

	public static void main(String[] args) {
		
		System.out.println(fib(10));

	}

}


