package Arrays;

public class ArrayMajorityElementNaiveNby2TimesNaive {
	
	 static int findMajority(int arr[], int n)
	    {
	    	for(int i = 0; i < n; i++)
	    	{
	    		int count = 1;

	    		for(int j = i + 1; j < n; j++)
	    		{
	    			if(arr[i] == arr[j])
	    				count++;
	    		}

	    		if(count > n / 2)
	    			return i;
	    	}

	    	return -1;
	    }


	    public static void main(String args[]) {
	    	
	       int arr[] = {8,7,6,8,6,6,6,6}, n = 8;
	       System.out.println(findMajority(arr, n));

	    }

}

/*
 * Implementation approach:
 * initially 
 * arr[] = {8,7,6,8,6,6,6,6}
 * count=1, n=8
 * 
 * i=0 : count=1, run a loop, count =2 (8 appears twice): n/2 = 8/2=4 (count should be atleast greater than 4)
 * i=1 : 7 -> count=1
 * i=2 : 6 -> count=5, n/2 = 5/2 = 2
 * i=3 :
 */
