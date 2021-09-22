package Searching;


/**
 *  Implementation:
 *  arr[] = {10,20,30,40,50,60,70}, x=20; n=6;
 *  formula: (low+high)/2
 *  	mid point: 0+6/2 =>3
 * 	bSearch (arr,0,6,20)
 * 		mid = 0+6/2 = 3
 * 	if(arr[mid] > x) : high = mid-1, low=0
 * 	bSearch (arr,0,2,20)
 * 		mid=0+2/2 = 1
 * check if(arr[mid]==x)
 * 		return mid
 * 	else if(arr[mid] < x) : high = 0, low=mid+1 (element found on the right hand side of the middle element)
 *
 */

public class BinarySearchRecursive {
	static int bSearch(int arr[], int low, int high, int x)
	{
		if(low > high)
			return -1;

		int mid = (low + high) / 2;

		if(arr[mid] == x)
			return mid;

		else if(arr[mid] > x)
			return bSearch(arr, low, mid - 1, x);

		else
			return bSearch(arr, mid + 1, high, x);
	}

	public static void main(String args[]) 
    {
        int arr[] = {10, 20, 30, 40, 50, 60, 70}, n = 7;

		int x = 20;

        System.out.println(bSearch(arr, 0, n - 1, x));
    } 

}


/**
 *  Implementation 2:
 * 
 *  arr[] = {10,20,30,40,50,60,70}, x=25; n=6;
 *  formula: (low+high)/2
 *  
 * 	bSearch (arr,0,6,20)
 * 		mid = 0+6/2 = 3						-> 40 > 25
 * 		arr[mid] > x										
 * 		
 * 		bSearch(arr,0,2,25)					-> high = mid-1 and low =0	
 * 			mid = 0+2/2 =1					
 * 			arr[mid] < x 					-> 20 < 25; low = mid+1, high =2
 * 			bSearch(arr,2,2,25)
 * 				mid=2+2/2=2
 * 				arr[mid] > x				-> 30 > 25; low=2, high=mid-1
 * 				bSearch(arr,2,1,25)				
 * 
 * 
 * 
 * 
 *
 */
