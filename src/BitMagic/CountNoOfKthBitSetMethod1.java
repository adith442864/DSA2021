package BitMagic;

public class CountNoOfKthBitSetMethod1 {

	public static int main(String[] args) {
		
		int n=5; //Binary rep: 00000.......0101
		
		int res=0;
		
		while(n>0) {		
			if(n%2!=0)	//=> this can be replaced as if((n&1)==1)
				res++;	//=> res++;
			n=n/2; 		//=> n=n>>1; 
			return res;
			
			
		}
		return res;
		
	}

}

// time complexity: theta(total bits in n)