package Sorting;

public class QuickSortLomutoPartition {

	 public static void main (String[] args) 
	    {
	        int arr[] = new int[]{8,4,7,9,3,10,5};
	        
	        int n = arr.length;
	        qSort(arr,0,n-1);
	        
		    for(int x: arr)
		        System.out.print(x+" ");
	        
	    }
	    //lomuto partition algorithm:
	    static int iPartition(int arr[], int l, int h)
	    {   //always h = last element in the array:
	        int pivot=arr[h];
	        int i=l-1; //-1
	        for(int j=l;j<=h-1;j++){ //-1 <=7
	            if(arr[j]<pivot){
	                i++;
	                //swapping:
	                int temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            }
	        }
	        //swapping: swap the element to the correct position
	        int temp=arr[i+1];
	        arr[i+1]=arr[h];
	        arr[h]=temp;
	        return i+1;
	    }
	    
	    static void qSort(int arr[],int l,int h){
	        if(l<h){
	            int p=iPartition(arr,l,h);
	            qSort(arr,l,p-1);
	            qSort(arr,p+1,h);
	        }
	    }

}

/*
 * Divide and conquer algorithm
 * worst case time: O(n^2)
 * Despite O(n^2) worst case, it is considered faster, because of the following reasons	
	 * 	a) in place
	 * 	b) cache friendly
	 * 	c) Average case is O(nlogn)
	 *  d) Tail Recursive
 *  Partition is key function (naive, lomuto, Hoare)
 */
