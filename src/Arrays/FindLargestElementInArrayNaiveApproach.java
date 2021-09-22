package Arrays;

public class FindLargestElementInArrayNaiveApproach {
	
	@SuppressWarnings("unused")
	static int getLargest(int arr[]) {
		
		int n= arr.length;
		
		for(int i=0; i<n; i++) {
			
			boolean flag = true;
			
			for(int j=0; j<n; j++) {
				if(arr[j] > arr[i]) {
					flag = false;
				break;
				}
			}
			
			if(flag==true)
				return i;
				
		}
		
		return -1; // this line is never be reached as there is always be a largest element in an array:
		
	}  
	

	public static void main(String[] args) {
		
		int arr[] = {5,8,20,10};
		System.out.println(getLargest(arr));

	}

}

// O(n^2) solution and a O(n) solution.