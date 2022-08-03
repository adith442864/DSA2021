package Sorting;

import java.util.Arrays;

public class SortTwoTypesOfArrayElements {
	
	
	 static void sortNaive(int arr[],int n){
	        
		 int[] temp=new int[n];
	        int i=0;
	        
	        for(int j=0;j<n;j++)
	            if(arr[j]<0)
	                temp[i++]=arr[j];
	        
	        for(int j=0;j<n;j++)
	            if(arr[j]>=0)
	                temp[i++]=arr[j];
	        
	        for(int j=0;j<n;j++)
	            arr[j]=temp[j];
	    }
	 
	 //Hoare Partitio "
	 static void sortEfficient(int arr[],int n){
	      
		 int i= -1, j=n;
		 while(true) {
			 do {i++;} while(arr[i] <0);
			 do {j--;} while(arr[j] >=0);
			 //swapping:
			 if(i>=j)
				 return;
			  int temp=arr[i];
	          arr[i]=arr[j];
	          arr[j]=temp;
		 }
	  }

	public static void main(String[] args) {
		
		 int arr[] = new int[]{13,-12,18,-10};   
	     int n = arr.length;
	        
	    //sortNaive(arr, n);
	     sortEfficient(arr, n);
	    
	    System.out.println(Arrays.toString(arr));
	}

}
