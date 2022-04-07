package Basics;

public class LCM {
	
	static int LCM(int a, int b) {
		
		int res = Math.max(a, b);
		
		while(true) {
			if(res%a==0 && res%b==0) 
				return res;
			res++;
		}
		
	}

	public static void main(String[] args) {
		
		int a=4, b=6;
		
		System.out.println(LCM(a, b));

	}

}
