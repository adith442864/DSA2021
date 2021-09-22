package InterviewQuestions;

public class FindStringsAreAnagrams {

	public static void main(String[] args) {
		
		String word = "Angel";
		String anagram = "Angle";
		
		boolean isAnagram = isAnagramUsingStringMerhods(word, anagram);
		System.out.println(isAnagram);

	}
	
	
	public static boolean isAnagramUsingStringMerhods(String word, String anagram) {
		
		if(word.length() != anagram.length()) 	
			return false;
		
		for(int i=0; i<word.length(); i++)
		{
			char c = word.charAt(i);
			int indexOf = anagram.indexOf(c);
			
			if(indexOf !=- 1) {
				anagram= anagram.substring(0, indexOf) + anagram.substring(indexOf+1, anagram.length());
				
			}
			else {
				return false;
			}
			
		}
		return anagram.isEmpty();
		
	}

}
