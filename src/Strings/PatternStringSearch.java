package Strings;

public class PatternStringSearch {
	
	// i/p: GEEKSFORGEEKS
	// o/p: EKS  -> 2, 10

	// i/p: AAAAA
	// o/p: AAA --> 0, 1, 2
   
    static void patSearchinng(String txt,String pat)
    {
	    int m=pat.length();
	    int n=txt.length();
	    for(int i=0;i<=(n-m);i++){
		    int j;
		    for(j=0;j<m;j++)
		    if(pat.charAt(j)!=txt.charAt(i+j))
		    break;
	        
	        if(j==m)
	        System.out.print(i+" ");
		    }
    }
  
    public static void main(String args[]) 
    {   
    	String txt = "AAAAAA";
    	String pat="AAA";
        System.out.print("All index numbers where pattern found: ");
        patSearchinng(txt,pat);  
    } 

}
