package Recursions;

import java.util.Collections;




public class PrintingAllPermutations {
	
	static void permute(String str, int l, int r) {
		
		/**
		    * permutation function
		    * @param str string to calculate permutation for
		    * @param l starting index
		    * @param r end index
		    */
			if(l==r) 
				System.out.println(str);
			
			for(int i=l; i<=r; i++) {
				str = swap(str, l, i);
				permute(str, l+1, r);
				str = swap(str, l, i);
				
			}
			
		
		
	}
	
	static String swap(String a, int i, int j) {
		
		char temp;
		char[] charArray = a.toCharArray();
		temp=charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		
		return String.valueOf(charArray);
		
		
	}
		
	public static void main(String[] args) {
		
		String s="ABC";
		int n = s.length();
		permute(s, 0, n-1);
		

	}

}
