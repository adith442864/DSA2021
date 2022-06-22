package Recursions;

public class RecursionPrintAllStringCombination {
	
	static void permute(String str, int index) {
		
		if(index==str.length())
			System.out.println(str);
		
		for(int j=index; j<=str.length()-1; j++) {
			str = swap(str, index, j);
			permute(str, index+1);
			str = swap(str, j, index);
			
		}
	}
	
	static String swap(String a, int i, int j) {
		
		char temp;
		char[] charArray = a.toCharArray();
		
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j] = temp;
		
		return String.valueOf(charArray);
		
		
	
	}

	public static void main(String[] args) {
		String s="ABC";
		int n=s.length();
		
		permute(s, n);

	}

}
