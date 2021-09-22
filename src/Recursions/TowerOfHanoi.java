package Recursions;

public class TowerOfHanoi {
	
	// logic: Lets consider three towers A, B and C, if n=1 given, how many moves a disk can take from tower A to tower C...
	// n=1
		//move disc1 from A to C
	
	// if n=2
		// move disc1 from tower A to tower B
		// move disc2 from tower A to tower C
		// move disc1 from tower B to tower C
	
	//if n=3
		//move disc1 from tower A to tower C
		//move disc2 from tower A to tower B
		//move disc1 from tower C to tower B
		//move disc3 from tower A to tower C
		//move disc1 from tower B to tower A
		//move disc2 from tower B to tower C
		//move disc1 from tower A to tower C
	
	//Algorithm:
		//towerOfHanoi(n,A, B, C)
			// tOH(n-1,A,C,B)
			// move disc n from A to C
			// toh(n-1,B,A,C)
	
	//Formula: T(1) = 1
				//T(n) = 2T(n-1)+1
	
	// RULES:
		// 1. Only one disc moves at a times
		// 2. No longer disc above smaller
		// 3. only the top disc of the tower can be moved...
	
	static void ToH(int n, char A, char B, char C) 
    { 
        if (n == 1) 
        { 
            System.out.println("Move 1 from " +  A + " to " + C); 
            return; 
        } 
        ToH(n-1, A, C, B); 
        System.out.println("Move " + n + " from " +  A + " to " + C); 
        ToH(n-1, B, A, C); 
    } 
      
   
    public static void main(String args[]) 
    { 
        int n = 3; 
        ToH(n, 'A', 'B', 'C');  
    } 
	
	

}
