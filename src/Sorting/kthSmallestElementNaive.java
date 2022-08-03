package Sorting;

import java.util.Arrays;

public class kthSmallestElementNaive {
	
	public static int kthSmallest(int arr[], int n, int k) {
		
		Arrays.sort(arr);
		return arr[k-1];
	}

	public static void main(String[] args) {
		
		int arr[] = {10,5,30,12};
        int n = arr.length;
        int k=3;
	    System.out.print(kthSmallest(arr,n,k));
		
	}

}
