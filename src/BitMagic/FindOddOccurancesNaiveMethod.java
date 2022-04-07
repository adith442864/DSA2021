package BitMagic;

public class FindOddOccurancesNaiveMethod {
	
	static int findOdd(int n, int arr[]) {
		
		int count=0;
		for(int i=0;i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[j]==arr[i])
					count++;
				
			}
			
			if(count%2!=0)
				return arr[i];
			
		}
		return 0;
		
		
	}

	public static void main(String[] args) {
		
		int arr[]= {4, 3, 4, 4, 4, 5, 5, 3, 3}, n = 9;
	    
		System.out.println(findOdd(n, arr));

	}

}
