package Searching;

public class SearchFirstIndexOccurenceBinarySearchRecursion {
	
	static int firstOccurence(int arr[], int low, int high, int x) {
		
		if(low > high)
			return -1;

		int mid = (low + high) / 2;

		if(x > arr[mid])
			return firstOccurence(arr, mid + 1, high, x);

		else if(x < arr[mid])
		
			return firstOccurence(arr, low, mid - 1, x);

		else
		{
			if(mid == 0 || arr[mid - 1] != arr[mid])
				return mid; 

			else
				return firstOccurence(arr, low, mid - 1, x); // this will go back to left side of array to find a first occurrence:
		}
	}

	public static void main(String[] args) {
		 int arr[] = {5, 10, 10,20, 20,20}, n = 7;

		int x = 10;
			
		System.out.println(firstOccurence(arr, 0, n - 1, x));

	}

}
