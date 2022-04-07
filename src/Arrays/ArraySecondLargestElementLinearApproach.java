package Arrays;

/**
 * i/p: arr[] = {10,5,8,20}
 * o/p: 0 : index of 10
 * 
 * i/p: arr[] = {20,10,20,8,12}
 * o/p: 4 : index of 12
 * 
 * i/p: arr[]= {10,10,10}
 * o/p: -1 : No index present
 * 
 * i/p: arr[] = {5,20,12,20,10};
 * o/p: 2
 */
public class ArraySecondLargestElementLinearApproach {
	
	static int firstLargest(int arr[], int n) {
		
		n=arr.length;
		int res=0;
		
		// finding largest one using efficient approach:
		for(int i=1; i<n; i++) 
			if(arr[i] > arr[res])
				res=i;
			return res;	
	}
	
	// second largest element:
	static int secondLargest(int arr[]) {
		
		int n = arr.length;
		int largest = firstLargest(arr, n);
		
		int res=-1; // sometimes the arr [] = {10,10,10}, there is no second largest here, hence return -1:
		
		for(int i=0; i<n; i++)
			if(arr[i] != arr[largest])
			{
				if(res==-1) // res is set to -1, 
					res =i; // res is set to 0, initally 5 is not equal to -1. 
				else if(arr[i] > arr[res]) // compare 1st ele with res which is set to 0
					res=i;
			}
			
		return res;
		
	}

	public static void main(String args[]) {
		int arr[] = {5,20,12,20,10};
		
		System.out.println(secondLargest(arr));
	}

}

/**
 * implementation logic:
 * initally res=-1
 * i=0 : res = 0; largest =1;
 * i=1: ignore as 20 is equ to largest
 * i=2: res=2;
 * i=3; 10>12 -> so result not updated. 
 * i=4 : 
		
 */