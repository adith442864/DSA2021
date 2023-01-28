package TimeComplexity;

import java.util.Arrays;

public class QuadratictTime {
	
	//m*n --> O(n^2)
	public static void bubbleSort(int arr[]) {
		for(int i=0; i<arr.length-1; i++) { 
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					//Swap the elements
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	//time complexity:
			//(1+n+n+n) (1+n+n+n) 
			//(1+3n) (1+3n) ---> 1+3n+3n+9n^2 ---> 9n^2+6n+1 -- Quadratic equation
			// 9n^2+6n ---> 3n(3n+2) --> 9n^2 --> O(n^2)

	public static void main(String[] args) {
	
//		int m=5;
//		int n=5;
//		
//		for(int i=0; i<=m; i++) {
//			for(int j=0;j<=n;j++) {
//				System.out.print(i+""+j+" ");
//			}
//			System.out.println();
//		}
		
		int arr[]= {5,1,4,2,8};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		

	}
	
	
}
