package BitMagic;

public class BitwiseRightShift {

	public static void main(String[] args) {
		
		int x=33;
		// x:33 => 00000000000000000000000000100000
		// x>>1 => 00000000000000000000000000010000
		
		System.out.println(x>>1);
		
		int y=-2;
		// y:2 =>  00000000000000000000000000000010
		// y>>1 => 00000000000000000000000000000001
		System.out.println(y>>1);
		
		
		//Unassigned right shift::: >>>
		int z=-2;
		System.out.println(z>>>1);
		
		//implementation logic: 
		//z : 111....11
		//	  011....11

	}
	
	// implementation logic:
	// x:33 : 00...100001
	//		  00...010000
	
	

}
