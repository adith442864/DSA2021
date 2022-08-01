package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Divide and Conquer algorithm
 * stable algo
 * O(n logn) Time and O(n) space
 * well suited for linked lists. works in O(1) aux space
 * used in External sorting
 * In general for Arrays, Quicksort outperforms it.
 * 
 *
 */

public class MergeSortNaive {
	
	public static void main (String[] args) 
    {
        int a[] = new int[]{10,15,20,40};
        int b[] = new int[]{5,6,6,10};
  
        
        int m = a.length;
        int n = b.length;
        merge(a,b,m,n);
        
    }
    
    static void merge(int a[], int b[], int m, int n){
    
        int[] c=new int[m+n];
        
        for(int i=0;i<m;i++)
            c[i]=a[i];
       
        for(int j=0;j<n;j++)
            c[j+m]=b[j];
        
        Arrays.sort(c);
        
        for(int i=0;i<m+n;i++)
            System.out.print(c[i]+" ");
    }

}

