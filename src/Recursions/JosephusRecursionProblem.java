package Recursions;

public class JosephusRecursionProblem {
	
	/*
	 * Find the survivor of the person after killing the nth position 
	 */
	
	static int jos(int n, int k) {
		// Base case:
		if(n==1)
			return 0;
		
		else
			return (jos(n-1, k)+k)%n;
		//return jos(n,k)+1); where index starts with 1 and so on...
		
	}

	public static void main(String[] args) {
		System.out.println(jos(5, 3));
		System.out.println(jos(4, 2));
	}

}

/*

Logic implementation...
	=> jos(5,3)
	=> (jos(4,3)+3)%5
	=> (jos(3,3)+3)%4
	=> (jos(2,3)+3)%3
	=> (jos(1,3)+3)%2 => 0+3%2 = 1 
	
	time complexity : T(n-1)+constant work => T(n)

*/