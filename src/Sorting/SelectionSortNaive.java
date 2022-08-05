package Sorting;

import java.util.Arrays;

public class SelectionSortNaive {
	
	static void selectionSort(int arr[], int n) {
		
		int temp[] = new int[n];
		Integer INF = Integer.MAX_VALUE;
		
		for(int i=0; i<n; i++) {
			
			int min_index=0;
			
			for(int j=1; j<n; j++) 
				
				if(arr[j] < arr[min_index])
					min_index = j;
				
				temp[i] = arr[min_index];
				arr[min_index] = INF;
					
			
		}
		
		for(int i=0; i<n; i++)
			arr[i] = temp[i];
	}

	public static void main(String[] args) {
		int a[] = {2, 1, 4, 3};
    
		System.out.println("Arrays before swapping :" +Arrays.toString(a));
		selectionSort(a, 4);
		System.out.println("Arrays after swapping :" +Arrays.toString(a));

	}

}
