package Sorting;

import java.util.Arrays;

/*
 * A worst case O(n^2) sorting algorithm
 * Does minimum memory writes and can be useful for cases where memory writes in costly
 * in-place and not stable
 * useful to solve questions like find minimum swaps required to sort an array
 */

public class CycleSort {
	
	 static void cycleSortDistinct(int arr[], int n) 
	    { 
	        for(int cs=0;cs<n-1;cs++){
	            int item=arr[cs];
	            int pos=cs;
	            for(int i=cs+1;i<n;i++)
	                if(arr[i]<item)
	                    pos++;
	            //swap(item,arr[pos])
	            
	            int temp=item;
	            item=arr[pos];
	            arr[pos]=temp;
	            while(pos!=cs){
	                pos=cs;
	                for(int i=cs+1;i<n;i++)
	                    if(arr[i]<item)
	                        pos++;
	                        
	                //swap(item,arr[pos])
	                temp=item;
	                item=arr[pos];
	                arr[pos]=temp;
	            }
	        }
	    }


	public static void main(String[] args) {
		
		 int arr[] = { 20,40,50,10,30 }; 
	        int n = arr.length; 
	        cycleSortDistinct(arr, n); 
	        
	        System.out.println(Arrays.toString(arr));
		
		

	}
	
	
	
}
