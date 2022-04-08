package Arrays;

public class ArrayInsertElement {
	
	static int insertElement(int arr[], int n, int x, int cap, int pos) {
		// before insertion array : {5,7,10,20,-}
		// after insertion array : {5,3,7,10,20}
		
		// position starts with 1 and index always starts with 0:
		
		if(n==cap) //if size is equal to capacity, then return the old size of the array:
			return n;
		
		
		int idx = pos-1; // if pos=4, index=3
		
		for(int i=n-1; i>=idx; i--) {
			arr[i+1]=arr[i];
			arr[idx] = x;
			return n+1;
			
		}
		
		return -1;
			
		
	}

	public static void main(String[] args) {
		
		int arr[] = new int[5], cap=5, n=3;
		
		arr[0]=5; arr[1]=10; arr[2]=20;
		
		System.out.println("Before Insertion");
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		
		int x=7, pos=2;
		
		n = insertElement(arr, n, x, cap, pos);
		
		System.out.println("After Insertion");
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		

	}

}

// time complexity : big O(n)
