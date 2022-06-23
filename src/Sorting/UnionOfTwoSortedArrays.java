package Sorting;

import java.util.Arrays;

public class UnionOfTwoSortedArrays {
	
	static void printUnion(int a[], int b[]) {
		
		int m = a.length;
		int n = b.length;
		
		int c[] = new int[m+n];
		
		for(int i=0; i<m; i++) {
			c[i] = a[i];
		}
		
		for(int j=0; j<n; j++) {
			c[j+m] = b[j];
		}
		
		Arrays.sort(c);
		
		for(int i=0; i<m+n; i++) {
			if(i==0 || c[i]!=c[i-1])
				System.out.print(c[i] + " ");
		}
	}

	public static void main(String[] args) {
		

		int a[] = new int[]{3,5,10,10,10,15,15,20};
        int b[] = new int[]{5,10,10,15,30};
        
       printUnion(a, b);
	   


	}

}
