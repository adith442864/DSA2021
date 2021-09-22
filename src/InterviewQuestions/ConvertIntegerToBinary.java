package InterviewQuestions;


/*
 * Actually, the binary number consists of only 0 and 1.  To convert an integer to binary divide the number by 2 until it becomes 0. 
 * In each step take the modulo by 2 and store the remainder into an array or stack. 
 * If we store the remainder into an array then print it into reverse order. 
 * If we store the remainder into stack then simply pop one by one element and print it.
 */

public class ConvertIntegerToBinary {
	
	// Function to print binary number 
    static void printBinary(int[] binary, int id) 
    { 
        // Iteration over array 
        for (int i = id - 1; i >= 0; i--) 
            System.out.print(binary[i] + ""); 
    } 
  
    // Function convering decimal to binary 
    public static void decimalToBinary(int num) 
    { 
        // Creating and assigning binary array size 
        int[] binary = new int[35]; 
        int id = 0; 
  
        // Number should be positive 
        while (num > 0) { 
            binary[id++] = num % 2; 
            num = num / 2; 
        } 
  
        // Print Binary 
        printBinary(binary, id); 
    } 
  
    // Main Driver Code 
    public static void main(String[] args) 
    { 
        // Entered number to be convert into binary 
        int num = 45; 
  
        // Calling Our Above Function 
        decimalToBinary(num); 
    } 

}
