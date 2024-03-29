package Sorting;

import java.util.Arrays;


public class BubbleSortOptimized {
	
	static void bubbleSort(int arr[], int n){
        boolean swapped;
        
        for(int i = 0; i < n-1; i++){
            swapped = false;
            
            for(int j = 0; j < n - i - 1; j++){
       
            	if( arr[j] > arr[j + 1]){
                    
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    swapped = true;
                }
            }
            if(swapped == false) 
            break;
        }
    }
    
	public static void main (String[] args) {
	    int a[] = {2, 1, 4, 3};
	    System.out.println("Arrays before swapping :" +Arrays.toString(a));
	   
	    bubbleSort(a, 4);
	    System.out.println("Arrays after swapping :" +Arrays.toString(a));
	    

	    
	   
	}

}
