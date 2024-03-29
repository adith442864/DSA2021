package Sorting;

public class CountingSortEfficient {
	
	//object to be sorted: work for integer as well:
	public static void main (String[] args) 
    {
        int arr[] = { 1,4,4,1,0,1 };
        int n = arr.length; int k=5;
        countSort(arr, n, k); 
   
        for (int i = 0; i < n; i++) 
            System.out.print( arr[i] + " ");
        
    }
    
    static void countSort(int arr[], int n, int k) 
    { 
        int[] count=new int[k];
        for(int i=0;i<k;i++)
            count[i]=0;
        
        for(int i=0;i<n;i++)
            count[arr[i]]++; //{1,3,0,0,2}
            
        for(int i=1;i<k;i++)
        count[i]=count[i-1]+count[i]; //{1,4,4,4,6}
    
        int[] output=new int[n];
        
        for(int i=n-1;i>=0;i--){ //{0,_,1,1,_,_}
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        
        for(int i=0;i<n;i++)
            arr[i]=output[i];
    }

}
