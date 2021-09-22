package InterviewQuestions;
import java.util.ArrayList;

public class FindDuplicatesinAnArrayUsingArrayList {
	
	
	public static void main(String[] args) {
		
		int arr[] = { 12, 11, 40, 12, 5, 6, 5, 12, 11 };
	    
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++)
			for(int j=i+1; j<arr.length; j++)
				if(arr[i]== arr[j]) {
					if(al.contains(arr[i])) {
						break;
					}
					else {
						al.add(arr[i]);
					}
					System.out.println(arr[i]);
				}
			

	}

}
