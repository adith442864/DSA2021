package Arrays;

/**
 * i/p: arr[] = {10,5,7,30}
 * o/p: arr[] = {30,7,5,10} 
 * 
 * i/p: arr[] = {30,20,5}
 * o/p: arr[] = {5,20,30} 
 *
 */

public class ArrayReverse {
	
	static void arrayReverse(int arr[]) {
		
		int n=arr.length;
		
		int low=0, high=n-1;
		
		while(low<high) {
			//swap two arrays:
			int temp = arr[low];
			arr[low]= arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		
		
		
		
	}

	public static void main(String[] args) {
		int arr[] = {30,7,6,5,10}, n=4;
		System.out.println("Before reverse");
		
		for(int i=0; i<=n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		arrayReverse(arr);
		
		System.out.println("After revserse");
		
		for(int i=0; i<=n; i++) {
			System.out.print(arr[i]+" ");
		}


	}

}
