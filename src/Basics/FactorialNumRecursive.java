package Basics;

public class FactorialNumRecursive {
	
	static int fact(int n) {
		
		if(n==0) 
			return 1;
			return n*fact(n-1);
		
	}

	public static void main(String[] args) {
		
		int n=0;
		System.out.println(fact(n));

	}

}

// time complexity : n*fact(n-1) -> T(n)= T(n-1)+θ(1)
