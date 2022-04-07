package Arrays;

public class ArrayMaxSumFromSubArrayNaive {
	
	static int maxSum(int arr[], int n)
    {
    	int res = arr[0];

    	for(int i = 0; i < n; i++)
    	{
    		int curr = 0;

    		for(int j = i; j < n; j++)
    		{
    			curr = curr + arr[j];

    			res = Math.max(res, curr);
    		}
    	}
    	
    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {1, -2, 3, -1, 2}, n = 5;

       System.out.println(maxSum(arr, n));

    } 

}


/*
 * Implementation:
 * {1,02,3,-1,2}
 * i=0:
 * 	curr=0
 * 	curr=1
 * 	curr=1-2=-1
 * 	curr= -1+3=2, res=2
 * 	curr = 2-1=1
 * 	curr=1+2=3, res=3
 * 
 * i=1:
 * 	curr=0
 * 	curr=-2
 * 	curr=-2+3=1
 * 	curr=1-1=0
 * 	curr = 0+2=2 
 * 
 * 
 */
