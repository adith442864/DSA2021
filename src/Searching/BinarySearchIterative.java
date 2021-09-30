package Searching;

/**
 * Implementation:
 *  arr[] = {10,20,30,40,50,60,70}
 *  formula: (low+high)/2
 *  	mid point: 0+6/2 =>3
 * 	case1: (arr[mid]==x) ->
 * 			Logic:arr{10,20,30,40,50} :->x=30 -> 0+4/2 =2 : return mid;
 *  case2: (arr[mid]>x) ->
 *  		Logic:arr{10,20,30,40,50} :->x=10-> change high=mid-1;
 *  case3: (arr[mid]<x) ->
 *  		Logic:arr{10,20,30,40,50} :->x=50 ->change low=mid+1;
 * 
 *
 */

public class BinarySearchIterative {
	
	static int bSearch(int arr[], int n, int x)
	{
		int low=0, high=n-1;
		
		while(low<=high) {
		
		//compute the logic:
			int mid = (low+high)/2;
			
			if(arr[mid]==x)
				return mid;
			
			else if(arr[mid]>=x) //50>30
				high = mid-1;
			else
				low=mid+1;
			
		}
		
		return -1;
	}

	public static void main(String args[]) 
    {
        int arr[] = {10, 20, 30, 40, 50, 60}, n = 6;

		int x = 25;
    
        System.out.println(bSearch(arr, n, x));
		
    } 
	
}
