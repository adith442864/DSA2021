package Arrays;

public class ArrayLeftRotateByDPlacesEfficient {
	
	static void leftRotateByTwo(int arr[], int n, int d) {
		
		int temp[] = new int[d]; // copy the elements in the temporary array: {1,2}

    	for(int i = 0; i  < d; i++)
    	{
    		temp[i] = arr[i];
    	}

    	for(int i = d; i  < n; i++)
    	{
    		arr[i - d] = arr[i];
    	}

    	for(int i = 0; i  < d; i++)
    	{
    		arr[n - d + i] = temp[i];
    	}	
		
		
		
	}

	public static void main(String[] args) {
		
		
		int arr[] = {1, 2, 3, 4, 5}, n = 5, d=2;

	       System.out.println("Before Rotation");

	       for(int i = 0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }

	       System.out.println();

	       leftRotateByTwo(arr, n, d);

	       System.out.println("After Rotation");

	       for(int i = 0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }
		
	}

}
