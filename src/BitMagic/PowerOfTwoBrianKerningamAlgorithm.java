package BitMagic;

public class PowerOfTwoBrianKerningamAlgorithm {
	
	static boolean powerOf2(int n) {
		
		if(n==0) 
			return false;
			return((n&(n-1))==0);
	}

	public static void main(String[] args) {
		
		int n=4;
		System.out.println(powerOf2(n));

	}

}
