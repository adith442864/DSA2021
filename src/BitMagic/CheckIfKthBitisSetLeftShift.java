package BitMagic;

public class CheckIfKthBitisSetLeftShift {

	public static void main(String[] args) {
		
		int n=5, k=3;
		
		if((n&(1<<k-1))!=0)
			System.out.println("yes");
		else
			System.out.println("no");
		

	}

}
