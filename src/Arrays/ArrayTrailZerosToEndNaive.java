package Arrays;


public class ArrayTrailZerosToEndNaive {
	
		
	// Function which pushes all zeros to end of an array.
    static void pushZerosToEnd(int arr[], int n) {
    	
    	for(int i=0; i<n; i++) {
    		
    		int count=0;
    		
    		if(arr[i]== 0) {
    			
    			for(int j=i+1; j<n; j++) {
    				if(arr[j]!=0) {
    					int temp = arr[i];
    					arr[i] = arr[j];
    			        arr[j] = temp;
    			        i++;
    			        j++;
    				}
    			}
    		}
    	}
    	
    }
    
//    static void swap(int arr[], int i, int j) {
//		int temp = arr[i];
//    	arr[i] = arr[j];
//    	arr[j]= temp;
//    }
    
  
	 

	public static void main(String[] args) {
		
		int arr[] = {10,5,0,0,8,0,9,0};
		
        int n = arr.length;
        
        pushZerosToEnd(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
		

}
