package Sorting;

import java.util.Arrays;

public class FindMinDifferenceInArrayEffcient {
	
	static int getMinDiffEfficient(int arr[], int n) {
		
		Arrays.sort(arr);
		
		int res = Integer.MAX_VALUE;
		
		for(int i=1; i<n; i++) 
			
			for(int j=0; j<i; j++) 
				res = Math.min(res, arr[i] - arr[j]);
		return res;
	}


	public static void main(String[] args) {
	
		int arr [] = {10,3,20,12};
		
		System.out.println(getMinDiffEfficient(arr, 3));
	
	}


}
