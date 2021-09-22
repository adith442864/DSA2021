package Recursions;

public class RecursionCountSubsets {
	
	static int countSubsets(int arr[], int n, int sum)
	{
		if(n==0)
			return sum==0? 1 : 0;
		
		// when not included, sum 25 is given to first logic
		// when included, 25 will be subtracted from the given array (Second logic)
		// Traversed from right to left side.
		
		
		return countSubsets(arr, n-1, sum) + 
				countSubsets(arr, n-1, sum - arr[n-1]);
	}

	public static void main (String[] args) {
		
		int n = 3, arr[]= {10, 20, 15}, sum = 25;

		System.out.println(countSubsets(arr, n, sum));

	}

}

//time complexity : 2 power n + (2 power n-1) = T(2 power n)