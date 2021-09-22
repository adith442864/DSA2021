package Recursions;

public class RecursiveDirect {
	
	static void fun1(int n) {
		
		if(n==0) // This is called Base case..to stop calling, will write terminating condition..
			return;
		
		System.out.println("GFG");
		fun1(n-1);
		
	}

	public static void main(String[] args) {
	
		fun1(2);
		System.out.println("ABC");
		

	}

}
