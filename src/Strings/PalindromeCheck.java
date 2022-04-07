package Strings;

public class PalindromeCheck {
	
	//Naive Method:
	public static boolean isPal(String str) {
		
		StringBuilder rev = new StringBuilder(str);
		 rev.reverse();
		 return str.equals(rev.toString());
	}
	
	//Efficient Solution:
	public static boolean isPalindrome(String str) {
		
		int begin =0;
		int end = str.length()-1;
		
		while(begin<end) {
			if(str.charAt(begin)!=str.charAt(end)) 
				return false;
			else
			begin++;
			end--;
			
		}
		
		return true;
		
		
	}

	public static void main(String[] args) {
		
		String str = "ABCBA";
		String rev = "ABCCBA";
		
		System.out.println(isPal(str));
		System.out.println(isPalindrome(str));
		
	}

}
