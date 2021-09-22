package InterviewQuestions;
import java.util.Arrays;

public class StringAnagramUsingArraySortMethod {

	public static void main(String[] args) {
		
		String word = "Angel";
		String anagram ="Anegl";
		
		boolean flag = isAnagramUsingArraySort(word, anagram);
		System.out.println(flag);

	}
	
	
	public static boolean isAnagramUsingArraySort(String word, String anagram) {
		String sortedWord = sortChars(word);
		String sortedAnagram = sortChars(anagram);
		
		return sortedWord.equals(sortedAnagram);
	}
	
	public static String sortChars(String word) {
		char[] c = word.toLowerCase().toCharArray();
		Arrays.sort(c);
		return String.valueOf(c);
	}

}
