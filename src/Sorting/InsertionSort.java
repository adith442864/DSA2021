package Sorting;

public class InsertionSort {
	
	 public static void main (String[] args) 
	    {
	        int arr[] = new int[]{50,20,40,60,10,30};
	        
	        int n = arr.length;
	        iSort(arr,n);
	        
	        for(int x:arr)
	            System.out.print(x+" ");
	        
	    }
	    
	    static void iSort(int arr[],int n){
	    	
	    	for(int i=1; i<n; i++) {
	    		
	    		int key=arr[i]; //50
	    		int j=i-1; // //0th element : 50
	    		
	    		while(j>=0 && arr[j] > key) { //50>20
	    			arr[j+1] = arr[j];
	    			j--;
	    		}
	    		
	    		arr[j+1] = key; //5 10
	    	}
	    
	    }
}

/*
 * O(n2) in worst case --> quadtratic times
 * In place and stable
 * used in practice for small arrays (TimSort and IntroSort)
 * O(n) is the Best case
 */
