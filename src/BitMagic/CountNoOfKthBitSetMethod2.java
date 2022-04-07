package BitMagic;

public class CountNoOfKthBitSetMethod2 {
	
	//Brian kerningams Algorithm:

	public static int main(String[] args) {
		
		int n=40;
		
		int res=0;
		
		while(n>0) {
			n=(n&(n-1)); // turning of the last bit set... 40, 39 and 32, 31 and 0...
			res++;
		}
		return res;
	}

}

// time complexity: theta(set bit count)