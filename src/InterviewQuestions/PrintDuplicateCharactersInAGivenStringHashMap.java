package InterviewQuestions;
import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateCharactersInAGivenStringHashMap {
	
	static void printDuplicates(String str) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		//Convert String to Char Array
		char[] charArray = str.toCharArray();
		
		for(Character c : charArray)
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		
		// Traverse the HashMap, check 
        // if the count of the character 
        // is greater than 1 then print 
        // the character and its frequency 
        for (Map.Entry<Character, Integer> entry : 
             map.entrySet()) { 
  
            if (entry.getValue() > 1) { 
                System.out.println(entry.getKey() 
                                   + " : "
                                   + entry.getValue()); 
            } 
        } 
		
	}
	
	

	public static void main(String[] args) {
		
		
		String str = "geeksgeeks";
		
		printDuplicates(str);
		
		

	}

}
