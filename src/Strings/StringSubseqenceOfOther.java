package Strings;

public class StringSubseqenceOfOther {
	
	public static boolean isSubSeq(String s1, String s2, int n, int m) {
		
		int j=0;
		for(int i=0; i<n&&j<m; i++) {
			if(s1.charAt(i)== s2.charAt(j))
				j++;
		}
		return (j==m);
	}
	
	//Recursive Solution:
	static boolean isSubSequence(String s1, String s2, int n, int m){
        if( m == 0 )
            return true;
        
        if( n == 0 )
            return false;
            
        if ( s1.charAt(n-1) == s2.charAt(m-1))
            return isSubSequence(s1, s2, n-1, m-1);
        
        else
            return isSubSequence(s1, s2, n-1, m);
    }

	public static void main(String[] args) {
		
		String s1="ABCDEF";
		String s2="ADE";
		
		int n, m;
		
		System.out.println(isSubSeq(s1, s2, 6, 3));
		System.out.println(isSubSequence(s1, s2, 6, 3));

	}

}
