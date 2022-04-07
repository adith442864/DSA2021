package Arrays;

//logic : a0,a1,a2.......ai-1..ai
	/*
	 * a[i]>a[largest] : res = largest, largest=i
	 * a[i]==a[largest] : ignore
	 * a[i]<a[largest]:
	 *    res==-1; res=i  {5,8,12,20}
	 *    a[i]<=a[res]=:ignore {5,8,12,12}
	 *    a[i]>a[res]; res=i 
	 *    {5,8,12,7} or {12,12,12,7} or {12,8,12,7} or {12,8,12,9}
	 */

public class ArraySecondLargestElementEfficientApproach {
	
	static int getSecondLargest(int arr[], int n) {
		
		n = arr.length;
		int res = -1, largest = 0;
		
		for(int i=1; i<n; i++) {
			if(arr[i] > arr[largest]) {
				res= largest;
				largest = i;
			}
			
			else if(arr[i]!= arr[largest]) 
			{
				if(res== -1 || arr[i] > arr[res])
					res=i;
			}
		}
		
		
		return res;
		
		
	}

	public static void main(String args[]) {
		
		int arr[] = {5,8,12,20,8};
		int n = arr.length;
		
		System.out.println(getSecondLargest(arr, n));

		
		
	}
	
	
}

/**
 * Implementation approach: {5,20,12,20,8}
 * largest = 0; res=-1;
 * i=1 : 5 : res=0; largest=1 
 * i=2 : res=2;
 * i=3 :
 * i=4 : 
 */

//time complexity : O(1)



