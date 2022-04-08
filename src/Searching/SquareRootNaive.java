package Searching;

public class SquareRootNaive {

	static int squareRoot(int x) {
		
		int i=1;
		
		while(i*i<=x) 
			i++;
			return i-1;

		
	}
	public static void main(String[] args) {
		
		System.out.println(squareRoot(15));
	
	}

}
