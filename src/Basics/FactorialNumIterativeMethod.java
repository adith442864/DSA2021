package Basics;

public class FactorialNumIterativeMethod {
	
	static int FactNum(int n) {
		int res=1;
		for(int i=2; i<=n; i++) {
			res= res*i;
		}
		return res;
		
	}

	public static void main(String[] args) {
		
		
		int n=5;
		System.out.println(FactNum(n));

	}
	
	//factorial of  n:  1*2*3*4, 
	//n=0 -> 1  and n=1 -> 1
	
	// time complexity: θ(n)
	

}
