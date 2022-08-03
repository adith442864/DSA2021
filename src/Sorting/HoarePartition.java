package Sorting;

public class HoarePartition {
	
	/*
	 * implementation steps:
	 * l=0, n=7, pivot = 5
	 * {5,3,8,4,2,7,1,10};
	 * i=-1, j=8
	 * i=0 j=6
	 * {1,3,8,4,2,7,5,10};
	 * i=2 j=4
	 * {1,3,2,4,8,7,5,10};
	 *
	 * 
	 */
	
	public static void main (String[] args) 
    {
        int arr[] = new int[]{5,3,8,4,2,7,1,10};
        //pivot = 5
        
        int n = arr.length;
        partition(arr,0,n-1);
        
	    for(int x: arr)
	        System.out.print(x+" ");
        
    }
    
    static int partition(int arr[], int l, int h)
    {   
    	//always consider 1st element is pivot element:
    	
        int pivot=arr[l];
        
        int i=l-1,
        j=h+1;
        //i=-1, j=8
        
        while(true){
            do{
                i++;
            }
            while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            
            if(i>=j)
            return j;
            //swapping:
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

}
