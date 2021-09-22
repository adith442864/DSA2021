package Arrays;

/**
 * i/p : arr[] ={8,12,15}
 * o/p : yes
 * 
 * i/p: arr[]={8,10,10,12}
 * o/p: yes
 * 
 * i/p: arr[] = {100}
 * o/p: yes
 * 
 * i/p: arr[]={100,20,200}
 * o/p: No
 *
 */
public class ArraySortedNaiveApproach {
	
	// This naive approach works only for sorted Array. if Array is unsorted, then it returns false. 
	
	static boolean arraySorted(int arr[]) {
		
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			 
			for(int j=i+1; j<n; j++) // starting with 1st element to traverse through the array:
				if(arr[j] < arr[i]) 
					return false;	
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		
		int arr[] = {5,10, 80,100};
		System.out.println(arraySorted(arr));
		

	}

}
