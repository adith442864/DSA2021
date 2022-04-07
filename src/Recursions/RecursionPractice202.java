package Recursions;

public class RecursionPractice202 {
	
	static int fun(int n) {
		if(n==1)
			return 0;
		else
			return 1+fun(n/2); 
		
		// how it works
		// 1+fun(16/2)...1+fun(8/2)...1+(4/2)....1+fun(2/2)....
		// fun(1) =0, fun(2)=1+fun(1)=2, fun(3)= 1+fun(2)=3, fun(4)=1+fun(3)=4..
		
	}
	

	public static void main(String[] args) {
			
		System.out.println(fun(16));

	}

}
