package BitMagic;

public class BitwiseLeftShift {

	public static void main(String[] args) {
		
		int x=3;
		System.out.println(x<<3);
		System.out.println(x<<2);
		
		int y=4;
		int z=(x<<y);
		System.out.println(z);
		
		// x	: 0000000000000000000000000000011
		// x<<1 : 0000000000000000000000000000110
		// x<<2 : 0000000000000000000000000001100
		// x<<3 : 0000000000000000000000000011000
		
		// x <<1 : 000....0110
		// x <<2 : 000....01100
		// x <<3 : 000....0110000
		

	}

}
