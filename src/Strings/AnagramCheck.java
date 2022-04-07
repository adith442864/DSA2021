package Strings;

import java.util.Arrays;

public class AnagramCheck {
	
	static final int CHAR=256;
	
	// Naive Solution -- Sorting Algo.
	public static boolean isAnagram(String s1, String s2){
		
		if(s1.length()!=s2.length())
			return false;
		
		char a1[] = s1.toCharArray();
		Arrays.sort(a1);
		s1  = new String(a1);
		
		char a2[] = s2.toCharArray();
		Arrays.sort(a2);
		s2  = new String(a2);
		
		return s1.equals(s2);
		
	}
	
	// Efficient Solution -- Counting Algo
	
	public static boolean areAnagram(String s1, String s2) {

		if(s1.length()!=s2.length())
			return false;
		 
		int[] count=new int[CHAR]; //comparing frequencies of chars in both the arrays
		    
		 for(int i=0;i<s1.length();i++){
		        count[s1.charAt(i)]++;
		        count[s2.charAt(i)]--;
		    }
		    
		    for(int i=0;i<CHAR;i++){
		        if(count[i]!=0)
		        	return false;
		    }
		    return true;
 } 
		  

	public static void main(String[] args) {
		
		String s1="abaac";
		String s2="aaabc";
		
		System.out.println(isAnagram(s1, s2));

	}

}
