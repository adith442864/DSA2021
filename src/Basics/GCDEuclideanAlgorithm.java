package Basics;

public class GCDEuclideanAlgorithm {

	public static int main(String[] args) {
		
		
		int a=10, b=15;
		
		while(a!=b) {
			if(a>b) {
				a= a-b;
			}else {
				b=b-a;
			}
		}
		
		return a;
	}

}


// Optimized Euclidean Algorithm: gcd(b,a%b)

