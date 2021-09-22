package Recursions;

public class RecursionForPalindrome {
	
	static boolean isPalindrome(String str, int start, int end) {
		
		// start =0
		// end = n-1
		
		// examples: aba, abcba, abba, cabac
		
		if(start>=end)
			return true;
		
		return(str.charAt(start)==str.charAt(end)) 
				&& isPalindrome(str, start+1, end-1);
		
		// && Short Circuit operator : 
		//	if first logic pass then only second logic will work otherwise false..
	}

	public static void main(String[] args) {
		
		String s = "geeks";
		
		System.out.println(isPalindrome(s, 0, s.length()-1));

	}

}

// time complexity : O(n)