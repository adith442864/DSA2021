package Arrays;

public class CircularSubArraySumNaive {
	
	 static int maxCircularSum(int arr[], int n)
	    {
	    	int res = arr[0];

	    	for(int i = 0; i < n; i++)
	    	{
	    		int curr_max = arr[i];
	    		int curr_sum = arr[i];

	    		for(int j = 1; j < n; j++)
	    		{
	    			int index = (i + j) % n;

	    			curr_sum += arr[index];

	    			curr_max = Math.max(curr_max, curr_sum);
	    		}

	    		res = Math.max(res, curr_max);
	    	}
	    	return res;
	    }


	    public static void main(String args[]) 
	    { 
	       int arr[] = {5, -2, 3, 4}, n = 4;

	       System.out.println(maxCircularSum(arr, n));

	    } 
}

/* Implementation Logic:
 *  arr[] = {5,-2,3,4}, res=5
 *  
 *  i=0 : curr_max = 10, res=10
 *  i=1 : res=10, curr_max = 10 -> Not updating anything.   	
 *  i=2 : curr_max=12, res=12
 *  i=3 : curr_max=10
 */