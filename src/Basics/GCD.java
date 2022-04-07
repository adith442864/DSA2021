package Basics;

public class GCD {
	
	static int gcd(int a, int b){
		
		int res= Math.min(a, b);
		
		while(res>=0) {
			if(a%res==0 && b%res==0) {
				break;
			}
			res--;
		}
		return res;
	
	}

	public static void main(String[] args) {
		
		int a=12, b=16;
		
		System.out.println(gcd(a, b));

	}

}

// time complexity:  O(min(a,b))