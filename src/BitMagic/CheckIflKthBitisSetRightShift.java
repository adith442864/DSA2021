package BitMagic;

public class CheckIflKthBitisSetRightShift {

	public static void main(String[] args) {
	
		
		int n=5, k=3;
		
		if((n>>(k-1)&1)==1)
			System.out.println("yes");
		else
			System.out.println("no");

	}

}
