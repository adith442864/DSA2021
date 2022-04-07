package Recursions;

public class Print1ToNRecursion {
	
	static void print1ToN(int n) {
		
		if(n==0)
		return;
		
		print1ToN(n-1);
		System.out.print(n +" ");
		
		
}

public static void main(String[] args) {
	
	int n=4;
	print1ToN(n);
	

}


}

//Complexity : T(n) = T(n-1)+T(1)
