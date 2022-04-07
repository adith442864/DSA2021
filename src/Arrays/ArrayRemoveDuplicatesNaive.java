package Arrays;

/**
 * Implementation approach:
 * arr [] = {10,20,20,30,30,30}

 * temp[] = {10,20,-,-,-} , res=1
 * 
 * i=1: temp[] = {10,-,-,-,-}, res=2
 * i=2: 
 * i=3: temp[] ={10,20,-,-,-}  res=3
 * i=4:
 * 
 *
 */

public class ArrayRemoveDuplicatesNaive {
	
	static int removeDuplicates(int arr[], int n) {
		
		int temp[] = new int[n];
		
		temp[0] = arr[0];
		int res=1;
		
		for(int i=1; i<n; i++) {
			if(temp[res-1]!=arr[i]) {
				temp[res] = arr[i];
				res++;
			}
				
		}
		
		// store the temporary content to original array:
		for(int i=0; i<res; i++) {
			arr[i] = temp[i];
		}
		
		return res;
		
    }

	public static void main(String[] args) {
		int arr[] = {10,20,20,30,30,30}; 
		int n=6;
		
		System.out.println("Before removing duplicates:");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");

		}
		
		System.out.println();
		
		n = removeDuplicates(arr, n);
		
		System.out.println("After removing duplicates:");
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");

		}
		

	}

}
