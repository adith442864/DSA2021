package Sorting;

import java.util.Arrays;

public class SelectionSort {
	
	static void selectionSort(int arr[], int n) {
		
		for(int i=0; i<n-1; i++) {
			int min_index=i;
			for(int j=i+1; j<n; j++) {
				
				if(arr[j] < arr[min_index]) {
					min_index = j; //1 2 4 3 //2nd 1 2 3 4 
				}
					
			}
			//swapping:
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
		
	}

	public static void main(String[] args) {
		
		 int a[] = {2, 1, 4, 3};
		 System.out.println("Before sorting :" +Arrays.toString(a));
		 selectionSort(a,4);
		 System.out.println("After sorting :" +Arrays.toString(a));

	}

}

//Time complexity: O(n^2)
// does less memory writes
// not optimal (cycle sort which is optimal)
// not stable
// basic idea of heap sort
// in-place algorithm