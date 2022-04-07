package Arrays;

public class ArrayMaxSumFromSubArrayEfficient {
	
	static int maxSum(int arr[], int n)
    {
    	int res = arr[0];

    	int maxEnding = arr[0];

    	for(int i = 1; i < n; i++)
    	{
    		maxEnding = Math.max(maxEnding + arr[i], arr[i]);

    		res = Math.max(maxEnding, res);
    	}
    	
    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {-3,8,-2,4,-5,6}, n = 6;

       System.out.println(maxSum(arr, n));

    } 

}


/*
 * Implementation:
 * 	{-3,8,-2,4,-5,6}
 * 	res =-3, maxEnding = -3
 * 
 *  i=1: maxEnding =(-3+8,8)
 *  res=8
 *  
 *  i=2: maxEnding =(8-2,-2)
 *  res=6
 *  
 *  i=3: maxEnding =(6+4, +3)
 *  res=10
 *  
 *  i=4: maxEnding =(10-5,-5)
 *  res=5
 *  
 *  i=5: maxEnding =(5+6,6)
 *  res=11
 *  
 *  

*/
