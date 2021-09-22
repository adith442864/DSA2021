package Arrays;

public class ArrayLeftRotateRecursion {
	 static void leftRotate(int arr[], int d, int n)
	 
	 
	    {
	    	reverse(arr, 0, d - 1); // reverse first two elements {2,1,3,4,5}

	    	reverse(arr, d, n - 1); // reverse last three elements {2.1.5,4,3}
 
	    	reverse(arr, 0, n - 1); // rotate the entire array {3,4,5,1,2}

	    }

	    static void reverse(int arr[], int low, int high)
	    {
	    	while(low < high)
	    	{
	    		int temp = arr[low];
	    		arr[low] = arr[high];
	    		arr[high] = temp;

	    		low++;
	    		high--;
	    	}
	    }

	    public static void main(String args[]) 
	    { 
	       int arr[] = {1, 2, 3, 4, 5}, n = 5, d = 3;

	       System.out.println("Before Rotation");

	       for(int i = 0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }

	       System.out.println();

	       leftRotate(arr, d, n);

	       System.out.println("After Rotation");

	       for(int i = 0; i < n; i++)
	       {
	       		System.out.print(arr[i]+" ");
	       }

	    } 

}
