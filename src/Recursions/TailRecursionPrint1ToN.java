package Recursions;

/*
 * Program to Print Tail Recursion for 1 To N Numbers...
 */

public class TailRecursionPrint1ToN {
	
	static void fun(int n, int k) {
		if(n==0)
			return;
		System.out.print(k + " ");
		fun(n-1, k+1);
	}

	public static void main(String[] args) {
		
		int n=4;
		fun(4, 1);
		

	}

}
