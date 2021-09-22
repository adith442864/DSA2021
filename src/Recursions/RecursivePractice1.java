package Recursions;

public class RecursivePractice1 {
	
	
	static void fun1(int n) {
		
		if(n==0)
			return;
		
		System.out.println(n);
		
//		if(n==1)
			fun1(n-1);
		System.out.println(n);
		
			
	}

	public static void main(String[] args) {
	
		fun1(3);
		
		
		
	}

}
