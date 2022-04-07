package BitMagic;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		int x=3, y=6;
		
		System.out.println(x&y);
		
		// x:3 : 00000000000000000000000000000011 (Represents 32bit in Java)
		// x:6 : 00000000000000000000000000000110
		//		----------------------------------
				//							 0010
		
		
		//OR:
		
		System.out.println(x|y);
		
		// x:3 : 00000000000000000000000000000011 (Represents 32bit in Java)
		// x:6 : 00000000000000000000000000000110
		//		----------------------------------
				//							 0111
		
		//:XOR:
			
			System.out.println(x^y);
		
		// x:3 : 00000000000000000000000000000011 (Represents 32bit in Java)
		// x:6 : 00000000000000000000000000000110
		//		----------------------------------
				//							 0101
			
			
						
		
		
	}

}
