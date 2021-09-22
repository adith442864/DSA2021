package InterviewQuestions;
import java.util.LinkedHashSet;

public class RemoveDuplicatesUsingHashSet {

	public static void main(String[] args) {
		
		int a[] = {1,2,2,3,3,4,4,5,5,6,6,7,7};
		
		removeDuplicates(a);
	}
	
	
	public static void removeDuplicates(int a[]) {
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for(int i=0; i<a.length; i++) {
			set.add(a[i]);
			
		}
		System.out.println(set);
		
	}

}
