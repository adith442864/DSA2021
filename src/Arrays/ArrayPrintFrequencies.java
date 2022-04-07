package Arrays;

public class ArrayPrintFrequencies {
	
	static void printFreq(int arr[], int n)
    {
    	int freq = 1, i = 1;

    	while(i < n)
    	{
    		while(i < n && arr[i] == arr[i - 1])
    		//if(i<n && arr[i]== arr[i-1])
    		{
    			freq++;
    			i++;
    		}

    		System.out.println(arr[i - 1] + " " + freq);

    		i++;
    		freq = 1;
    		
    	}
    	
    	if(n==1 || arr[n-1] != arr[n-2])
    		System.out.println(arr[n-1]+" ");
    	
    	
    }


    public static void main(String args[]) 
    { 
       //int arr[] = {10, 10, 20, 30, 30, 30}, n = 6;
    	int arr[] = {40, 50, 50, 50}, n = 4;


       printFreq(arr, n);

    } 


}
