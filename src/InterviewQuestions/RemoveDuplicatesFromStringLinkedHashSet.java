package InterviewQuestions;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromStringLinkedHashSet {

	public static void main(String[] args) {
		
		String str = "GeeksforGeeks";
		removeDuplicates(str);
		
	}
	
	
	static void removeDuplicates(String str) {
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<str.length(); i++) 
			set.add(str.charAt(i));
			
		for(Character ch: set) {
			System.out.print(ch);
		}
		
		
		
	}

}
