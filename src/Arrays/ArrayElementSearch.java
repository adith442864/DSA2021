package Arrays;

public class ArrayElementSearch {
	
	static int insertElement(int arr[], int x) {
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==x) {
				return i; //return of its 1st occurence
			}
		}
		return -1; //no element present in the array.
		
		
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {3,10,25,5}, x=25;
		
		System.out.println(insertElement(arr, x));
		
	}

}
