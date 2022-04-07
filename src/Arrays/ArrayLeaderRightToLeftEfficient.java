package Arrays;

public class ArrayLeaderRightToLeftEfficient {
	
	// Right To left traversal 
	// i/p: arr[]= {7, 10, 4, 10, 6, 5, 2}
	// o/p: arr[] = {2,5,5,10}
	
	static void arrayLeaderRToL(int arr[], int n) {
		
		int curr_ldr = arr[n - 1];

    	System.out.print(curr_ldr+" ");

    	for(int i = n - 2; i >= 0; i--)
    	{
    		if(curr_ldr < arr[i])
    		{
    			curr_ldr = arr[i];

    			System.out.print(curr_ldr+" ");
    		}
    	}
		
	}

	public static void main(String[] args) {
		
		int arr[] = {7, 10, 4, 10, 6, 5, 2}, n=7;
		arrayLeaderRToL(arr, n);

	}

}
