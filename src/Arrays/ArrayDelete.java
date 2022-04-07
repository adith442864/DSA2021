package Arrays;

public class ArrayDelete {
	
	// Array : {3,8,12,5,6}
	// After deletion : {3,8,5,6}
	
	static int arrayDelete(int arr[], int x, int n) {
		
		int i;
		
		// search operation:
		for(i=0; i<arr.length; i++) 
			if(arr[i]==x)
				break;
		
		// if no element is found till traversing to the last element by i, in this case come out of the function and return the same array:
		if(i==n)
			return n;
		
		//delete operation:
		for(int j=i; j<n-1; j++)
			arr[j] = arr[j+1];
			return n-1; // return the new size of the array
			
	}
	

	public static void main(String[] args) {
		
		int arr[] = {3,8,12,5,6}, x=12, n=5;
		
		System.out.println("Before Deleting Array is:");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("After Deleting Array is:");
		n = arrayDelete(arr, x, n);
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+ " ");
		
		
	}

}


// Insert : Big O(n) -> insert in the beginning
// Search : Big O(n) ->for unsorted 
// Search : Big O(log n) ->for sorted 
// Delete : Big O(n) 