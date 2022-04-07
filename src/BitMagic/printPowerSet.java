package BitMagic;

public class printPowerSet {
	
	static void printPowerSet(String str)
    {
    	int n = str.length(); 
    	System.out.println(n);

    	int powSize = (int)Math.pow(2, n); //n=8

    	for(int counter = 0; counter < powSize; counter++)
    	{
    		for(int j = 0; j < n; j++)
    		{
    			if((counter & (1 << j)) != 0)
    				System.out.print(str.charAt(j));
    		}
    		
    		System.out.println();
    	}
    }

    
   
    public static void main(String args[]) 
    { 
        String s = "abc";

        printPowerSet(s);  
    } 

}
