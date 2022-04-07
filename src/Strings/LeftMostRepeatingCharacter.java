package Strings;

public class LeftMostRepeatingCharacter {
	static final int CHAR=256;
	
	//Naive
	static int leftMost(String str) 
    {
    for(int i=0;i<str.length();i++){
        for(int j=i+1;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j))
            	return i;
        }
    }
    return -1;
    } 
	
	//better solution
    static int leftMostchar(String str) 
    {
	    int[] count=new int[CHAR];
	    for(int i=0;i<str.length();i++){
	        count[str.charAt(i)]++;
	    }
	    for(int i=0;i<str.length();i++){
	        if(count[str.charAt(i)]>1)return i;
	    }
	    return -1;
	    } 
  
    
    
    
    public static void main(String args[]) 
    {   String str = "cababd";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));  
    } 

}
