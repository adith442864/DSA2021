package BitMagic;

public class PowerOfTwo {
	
	static boolean powerOf2(int n) {
		
		if(n==0) {
			return false;
		}
		if(n!=1) {
			if(n%2!=0)
				return false;
			n=n/2;
			
		}
		return true;
	}
	

	public static void main(String[] args) {
		
		int n=4;
		System.out.println(powerOf2(n));

	}

}
