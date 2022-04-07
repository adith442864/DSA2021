package Recursions;

public class RecursionRopeCutting {
	
	static int maxCuts(int n, int a, int b, int c)
	{
		if(n == 0)
			return 0;
		if(n <= -1)
			return -1;

		int res = Math.max(maxCuts(n-a, a, b, c), 
		          Math.max(maxCuts(n-b, a, b, c), 
		          maxCuts(n-c, a, b, c)));

		if(res == -1)
			return -1;

		return res + 1; 
	}
    public static void main(String [] args) 
    {
    	//int n = 5, a = 2, b = 1, c = 5;
    	int n=23, a=11, b=9, c=12;
    	int m=9, x=2, y=2, z=2;
    	
    	System.out.println(maxCuts(n, a, b, c));
    	System.out.println(maxCuts(m, x, y, z));
        
    }

}

// time complexity : O(3 Power n)

/*
							n=23
			     |		     |
				 a			 b			  c
				n=12		 n=14  		 n=11
				| | |		 | | |		 | | |			
				1 3 0 (0)    3 5 2    (0)0 2 -1
				| | |
				-1 -1		-1 -1.............-1
*/