package BitMagic;

public class BitwiseNOT {

	public static void main(String[] args) {
		
		
		int x=1;
		int y=5;
		
		// x:	: 00000000000000000000000000000001 (Represents 32bit in Java)
		// ~x:	: 11111111111111111111111111111110 (Represents 32bit in Java)
		//        --------------------------------
		//											
		
		System.out.println(~x);
		
		// y:	: 00000000000000000000000000000101 (Represents 32bit in Java)
		// ~y:	: 11111111111111111111111111111010 (Represents 32bit in Java)
		//		  --------------------------------

		System.out.println(~y);


	}

}
