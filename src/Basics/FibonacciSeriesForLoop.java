package Basics;

public class FibonacciSeriesForLoop {

	public static void main(String[] args) {
		
		int n1=0; int n2=1; int i; int count=7;
		
		for(i=1; i<=count; i++) {
			
			System.out.print(n1+" "); // 0,
			
			int sumOfPrevNum = n1+n2; // 0+1 = 1, 1+1=2, 2+1=3, 3+2=5
			
			n1=n2; // 1, 1,2
			
			n2=sumOfPrevNum; //1, 2,3
			
			
		}
		

	}

}
