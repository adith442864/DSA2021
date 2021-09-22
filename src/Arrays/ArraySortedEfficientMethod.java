package Arrays;

public class ArraySortedEfficientMethod {
	
	static boolean arraySorted(int arr[]) {
		
		int n = arr.length;
		
		for(int i=1; i<n; i++) 
			if(arr[i] < arr[i-1])
				return false;
		
		return true;
		
	}
	

	public static void main(String[] args) {
		
		int arr[] = {5,10,20,40};
		System.out.println(arraySorted(arr));
	}

}
