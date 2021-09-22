package Basics;

public class CheckForPrimeNaiveMethod {
	
	// Prime Numbers: 2,3,5,7,11,13,17....  Which is divisible by 1 and the same number...
	// Non Prime numbers: 14 -> divisible by 1, 2, 7
	
	static boolean checkPrime(int n) {
		
		//Method-1
//		if(n==1)
//			return false;
//		
//		for(int i=2; i<n; i++)
//			if(n%i==0)
//				return false;
//		return true;
		
		// time complexity: O(n)
		
		//Efficient Method2:

//		if(n==1)
//			return false;
//			
//			for(int i=2; i*i<n; i++)
//				if(n%i==0)
//					return false;
//			return true;
		
		//time complexity : 0(Squar root of N)
			
			
			//Method-3
			if(n==1)
				return false;
			if(n==2 ||n==3)
				return true;
			if(n%2==0 || n%3==0)
				return false;
			
			for(int i=5; i*i<=n; i=i+6)
				if(n%i==0 || n/i+2==0)
					return false;
			return true;
			
			//time complexity: 
			
			
			
			
	}
	
	
		

	public static void main(String[] args) {
		// n=121, n=1031
		int num=1031;
		System.out.println(checkPrime(num));

	}

}
