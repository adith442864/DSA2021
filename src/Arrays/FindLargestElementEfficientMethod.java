package Arrays;

public class FindLargestElementEfficientMethod {
	
	static int getLargest(int arr[]) {
		
		int n = arr.length;
		
		int res =0; // initialize the index of the first element:
		
		for(int i=1; i<n; i++) 
			if(arr[i] > arr[res]) 
				res = i;
				return res;
		
	}
	
	// implementation approach:
	// res =0; 
	// i=1 :res = 1 -> 5 with 8
	// i=2 : res=2 -> 20 with 10
	// i=3: res=2 

	public static void main(String[] args) {
		
		int arr[] = {5,8,20,10};
		System.out.println(getLargest(arr));
		
	}

}


/**
	ai<=alargest : Ignore 
	ai>alargest : largest = i


*/