package Basics;

public class ComputationofPOWNaive {
	
	
	static int power(int x, int n) {
		
		int res=1;
		for(int i=0; i<n;i++)
			res= res*x;
		System.out.println(res);
		return res;
		
	}
	
	//Efficient Approach: Method2:
	static int pow(int x, int n) {
		
		if(n==0) 
			return 1;
		
		int temp = pow(x,n/2);
		temp=temp*temp;
		
		if(n%2==0) 
			return temp;
		else
			return temp*x;
	}
	
	
	
	

	public static void main(String[] args) {
		
		int x=3, n=4;
		
		power(x, n);
		System.out.println(pow(x, n));
		
	}

}

//time complexity : theta(n)