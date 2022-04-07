package Recursions;

public class RecursionPractice203 {
	
	static void fun(int n) {
		
		
		if(n==0)
			return;
		fun(n/2);
		System.out.println(n%2);
	}

	public static void main(String[] args) {
		
		fun(7);
	}

}

/*
 * fun(7)
 * |
 * |	 fun(3)
 * |	  |	fun(1)
 * |	  |	|	fun(0)
 * |	  |	|		executes 1%2 =1
 * |	  |	|
 * |	  |	|->1
 * |	  |->1		
 * | ->1
*/