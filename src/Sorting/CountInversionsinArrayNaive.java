package Sorting;

public class CountInversionsinArrayNaive {
	
	public static int countInversions(int arr[], int n) {
		
		int res=0;
		
		for(int i=0; i<(n-1); i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] > arr[j]) {
					res++;
				}
			}
		}
		
		return res;
		
	}
	

	public static void main(String[] args) {
		
		int arr[] = {2,4,1,3,5};
		 int n = arr.length;
		  System.out.print(countInversions(arr,n));
		

	}

}
