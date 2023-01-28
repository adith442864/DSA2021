package TimeComplexity;

public class CubicTime {
	
//	O(n^3)
	
	public static void tripleNestedLoop(int n) {
//		000 001 002 003 004 
//		010 011 012 013 014 
//		020 021 022 023 024 
		
		for(int x=0; x<n; x++) {
			for(int y=0; y<n; y++) {
				for(int z=0; z<n; z++) {
					System.out.print(x+""+y+""+z+" ");
				}
				System.out.println();
			}
		}
		
		//(1+n+n) (1+n+n+n) (1+n+n) ===> (1+2n) (1+3n) (1+3n) ==> n^3 + n^2 + n + 1 - Cubic equation
		//O9n^3)
		
		//3x+9y+8z = 79
		//0+63+16 = 79 --> 0,7,2
		
	}
	
	public static void multiNumEquation(int n) {

		for(int x=0; x<n; x++) {
			for(int y=0; y<n; y++) {
				for(int z=0; z<n; z++) {
					
					if(3*x + 9*y+ 8*z == 79) {
						System.out.println(x+","+y+","+z);
					}
					
				}
			}
		}
		
	}

	public static void main(String[] args) {
		
		//tripleNestedLoop(5);
		multiNumEquation(10);

	}

}
