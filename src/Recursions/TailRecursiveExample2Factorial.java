package Recursions;

public class TailRecursiveExample2Factorial {
	
	static int tailfact(int n, int k) {
		
		if(n==0 || n==1) 
			return k;
			return tailfact(n-1, k*n); // output : fact(3,1) : fact(2, 1*3) : fact2(1, 1*3*2)
		
	}

	public static void main(String[] args) {
		
		System.out.println(tailfact(3,1));
		
	}

}
