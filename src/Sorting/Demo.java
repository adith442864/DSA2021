package Sorting;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
		 int a[] = new int[]{3,8,10};
		 int n = a.length;
	     
		for(int i=0; i<n; i++) {
			int min_index = i;
			for(int j=i+1; j<n; j++) { //8
				
				if(a[j] < a[min_index]) { //3<8
					min_index = j;
					//swapping:
					int temp = a[i];
					a[i] = min_index;
					min_index = temp;
				}
			}
			
			System.out.println(a[i] +" ");
		}
		 
	     
	    

	}

}
