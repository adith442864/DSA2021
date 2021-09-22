package InterviewQuestions;

public class CountOccurencesOfCharsInGivenString {

	public static void main(String[] args) {
		
		String str = "abcaca"; 
	    System.out.println(countChar(str, 'a')); 

	}
	
	
	public static int countChar(String str, char x) {
		
		int count = 0;
		int n = 10;
		
		for(int i=0; i<str.length(); i++)
			if(str.charAt(i) == x)
				count++;
		
		int repetitions = n/str.length();
		count = count*repetitions;
		
		// if n is not the multiple of the  
	    // string size check for the remaining  
	    // repeating character. 
	    for (int i = 0; i < n % str.length(); i++)  
	    { 
	        if (str.charAt(i) == x) 
	            count++; 
	    } 
	  
	    return count; 
	    
	}

}
