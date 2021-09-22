package Basics;

public class AllDivisionsOfANumber {
	
	//Method1:
//	static void printDivisors(int n) {
//		for(int i=1; i<=n; i++) {
//			if(n%i==0)
//				System.out.println(i);
//		}
//	}
	
//	Method:2
//	static void printDevisorEfficient(int n) {
//		for(int i=1; i*i<=n; i++) {
//			if(n%i==0) {
//				System.out.println(i);
//				
//				if(i!=n/i)
//					System.out.println(n/i);
//					
//			}
//			
//		}
//	}

	
	//Method3:
	static void printDevisorEfficientwithSort(int n) {
		int i;
		for(i=1; i*i<=n; i++) 
			if(n%i==0)
				System.out.println(i);
		
		
		for(; i>=1;i--) 
			if(n%i==0)
				System.out.println(n/i);
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int n=15;
		//printDivisors(n);
		//printDevisorEfficient(n);
		printDevisorEfficientwithSort(n);

	}

}


//time complexity: Ѳ(n) or Ѳ(1)