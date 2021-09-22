package BitMagic;

public class FindMissingNumberFromArray {
	
	static int findMissing(int arr[], int n) {
		
		int total, i;
		total = (n+1)*(n+2)/2;
		
		for (i=0; i<n;i++)
			total=total-arr[i];
		return total;
		
			
	}

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,5}, n=4;
		
		System.out.println(findMissing(arr, n));
		

	}

}
