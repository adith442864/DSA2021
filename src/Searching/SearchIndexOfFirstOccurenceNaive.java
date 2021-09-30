package Searching;

public class SearchIndexOfFirstOccurenceNaive {
	
	static int firstOccurence(int arr[], int x) {
		
		int n = arr.length;
		
		for(int i=0; i<n; i++) 
			if(arr[i]==x)
				return i;
			return -1;
		
	}

	public static void main(String[] args) {
		
		int arr[] = {5, 10, 10, 15, 15}, n = 5;

		int x = 20;
    
        System.out.println(firstOccurence(arr, x));
		

	}

}
